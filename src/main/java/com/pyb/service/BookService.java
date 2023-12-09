package com.pyb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pyb.dao.BookMapper;
import com.pyb.vo.BookLoanVO;
import com.pyb.vo.BookVO;

@Service
@Transactional
public class BookService {

	@Autowired
	BookMapper mapper;
	
	public void insert(BookVO bookVo) {
		mapper.insert(bookVo);
	}

	public void loanBook(BookLoanVO bookloanVo) {
		mapper.loanBook(bookloanVo);
		mapper.loanStts(bookloanVo);
	}

	public int checkLoan(BookLoanVO bookloanVo) {
		return mapper.checkLoan(bookloanVo);
	}

	public int checkReturn(BookLoanVO bookloanVo) {
		return mapper.checkReturn(bookloanVo);
	}

	public void update(BookVO bookVo) {
		 mapper.update(bookVo);
	}

	public void returnBook(BookLoanVO bookloanVo) {
		 mapper.returnBook(bookloanVo);
		 mapper.returnStts(bookloanVo);
	}

	public List<BookLoanVO> loanHistory(String bookNo) {
		return mapper.loanHistory(bookNo);
	}



}
