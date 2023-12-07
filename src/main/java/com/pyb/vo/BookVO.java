package com.pyb.vo;

public class BookVO {

	private String bookNo;
	private String title;
	private String writer;
	private String publisher;
	private String publicationYear;
	private String status;
	
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getpublisher() {
		return publisher;
	}
	public void setpublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "BookVO [bookNo=" + bookNo + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", publicationYear=" + publicationYear + ", status=" + status + "]";
	}
	
	
}

