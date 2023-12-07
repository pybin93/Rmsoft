package com.pyb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyb.dao.BookMapper;
import com.pyb.vo.BookVO;

@Service
public class BookService {

	@Autowired
	BookMapper mapper;
	
	public int checkBook(BookVO bookVo) {
		return mapper.checkBook(bookVo);
	}

	public void insert(BookVO bookVo) {
		mapper.insert(bookVo);
		
	}


}
