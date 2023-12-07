package com.pyb.vo;

import java.util.Date;

public class BookLoanVO {

	public int loanNo;
	public String loanDate;
	public String returnDate;
	public int bookNo;
	public String memberId;
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	@Override
	public String toString() {
		return "BookLoanVO [loanNo=" + loanNo + ", loanDate=" + loanDate + ", returnDate=" + returnDate + ", bookNo="
				+ bookNo + ", memberId=" + memberId + "]";
	}
}
