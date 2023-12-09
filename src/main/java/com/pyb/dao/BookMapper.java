package com.pyb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pyb.vo.BookLoanVO;
import com.pyb.vo.BookVO;

@Mapper
public interface BookMapper {

	public int checkBook(BookVO bookVo);

	public void insert(BookVO bookVo);

	public void loanBook(BookLoanVO bookloanVo);

	public void loanStts(BookLoanVO bookloanVo);

	public int checkLoan(BookLoanVO bookloanVo);

	public int checkReturn(BookLoanVO bookloanVo);

	public void update(BookVO bookVo);

	public void returnBook(BookLoanVO bookloanVo);

	public void returnStts(BookLoanVO bookloanVo);

	public List<BookLoanVO> loanHistory(String bookNo);

}
