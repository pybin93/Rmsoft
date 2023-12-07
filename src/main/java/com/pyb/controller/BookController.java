package com.pyb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pyb.service.BookService;
import com.pyb.vo.BookVO;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/insert")
	@ResponseBody
	public Map<String, Object> insert(BookVO bookVo) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		// 1) DB INSERT
		bookService.insert(bookVo);
		
		result.put("result", "success");
		
		return result;
	}
	
	

	
}
