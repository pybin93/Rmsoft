package com.pyb.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pyb.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
    void join(MemberVO memberVo);

	int checkJoin(MemberVO memberVo);
}