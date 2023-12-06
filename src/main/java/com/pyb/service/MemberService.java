package com.pyb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyb.dao.MemberMapper;
import com.pyb.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper mapper;

	public void join(MemberVO memberVo) {
		mapper.join(memberVo);
	}

	public int checkJoin(MemberVO memberVo) {
		return mapper.checkJoin(memberVo);
	}

}
