package com.pyb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pyb.service.BookService;
import com.pyb.vo.BookLoanVO;
import com.pyb.vo.BookVO;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	// 도서 등록
	@PostMapping("/insert")
	@ResponseBody
	public Map<String, Object> insert(BookVO bookVo) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		// 1) DB INSERT
		bookService.insert(bookVo);
		
		result.put("result", "success");
		result.put("message", "등록이 완료되었습니다.");
		
		return result;
	}
	
	// 도서 정보 수정
	@PutMapping("/update")
	@ResponseBody
	public Map<String, Object> update(BookVO bookVo) {
	    Map<String, Object> result = new HashMap<>();

	    // 1) DB UPDATE
	    bookService.update(bookVo);

	    result.put("result", "success");
	    result.put("message", "수정이 완료되었습니다.");

	    return result;
	}
	
	
	// 도서 대출 이력 확인
	@GetMapping("/loanHistory")
	@ResponseBody
	public Map<String, Object> loanHistory(String bookNo) {
		
		System.out.println(bookNo);
		
	    Map<String, Object> result = new HashMap<>();
	    
	    // 1) DB SELECT
	    List<BookLoanVO> loanHistory = bookService.loanHistory(bookNo);
	    result.put("result", "success");
	    result.put("loanHistory", loanHistory);

	    
	    
	    return result;
	}
	
	
	// 도서 대출
	@PostMapping("/loan")
	@ResponseBody
	public Map<String, Object> loan(BookLoanVO bookloanVo){
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		// 1) 도서 대출이 가능한지 확인한다
		int cnt = bookService.checkLoan(bookloanVo);
		if (cnt == 0) {
			result.put("result", "fail");
			result.put("message", "이미 대여가 완료된 도서입니다");
			return result;
		}
		
		// 2) DB INSERT
		bookService.loanBook(bookloanVo);

		result.put("result", "success");
		result.put("message", "대출 처리되었습니다.");
		
		return result;
	}


	// 도서 반납
	@PostMapping("/return")
	@ResponseBody
	public Map<String, Object> returnBook(BookLoanVO bookloanVo) {
	    Map<String, Object> result = new HashMap<>();

	    // 1) 도서 반납이 가능한지 확인한다
	    int cnt = bookService.checkReturn(bookloanVo);
	    if (cnt == 0) {
	        result.put("result", "fail");
	        result.put("message", "이미 반납된 도서이거나 대여 기록이 없습니다");
	        return result;
	    }

	    // 2) DB UPDATE
	    bookService.returnBook(bookloanVo);

	    result.put("result", "success");
	    result.put("message", "반납 처리되었습니다.");

	    return result;
	}
	
}
