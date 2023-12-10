package com.pyb.vo;


public class BookLoanVO {

	public String loanNo;
	public String loanDate;
	public String returnDate;
	public String bookNo;
	public String memberId;
	
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
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
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
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
