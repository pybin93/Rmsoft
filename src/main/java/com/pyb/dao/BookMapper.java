package com.pyb.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pyb.vo.BookVO;

@Mapper
public interface BookMapper {

	public int checkBook(BookVO bookVo);

	public void insert(BookVO bookVo);

}
