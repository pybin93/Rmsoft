package com.pyb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyb.service.MemberService;
import com.pyb.vo.MemberVO;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello, pyb!";
	}
	
	@PostMapping("/join")
	public Map<String, Object> join(MemberVO memberVo) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		System.out.println(memberVo);
		
		// 1) ID가 빈값일 경우
		if (!StringUtils.hasText(memberVo.getMemberId())) {
			result.put("result", "fail");
			result.put("message", "ID가 빈값입니다.");
			return result;
		}
		
		// 2) ID가 기존에 가입된 사용자인지 체크한다
		int cnt = memberService.checkJoin(memberVo);
		if (cnt > 0) {
			result.put("result", "fail");
			result.put("message", "이미 사용중인 ID입니다.");
			return result;
		}
		
		// 3) DB INSERT
		memberService.join(memberVo);
		
		result.put("result", "success");
		
		return result;
	}

}
