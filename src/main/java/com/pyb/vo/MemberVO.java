package com.pyb.vo;

public class MemberVO {

	private String memberId;
	private String memberName;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}
