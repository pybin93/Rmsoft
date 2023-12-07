package com.pyb.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pyb.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
   public void join(MemberVO memberVo);

   public int checkJoin(MemberVO memberVo);

}