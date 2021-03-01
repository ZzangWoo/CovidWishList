package com.doongzzi.web.model;

public class TestModel {
	private int testSeq;
	private String testId;
	private String testContent;
	
	public TestModel(String testId, String testContent) {
		this.testId = testId;
		this.testContent = testContent;
	}
	
	public int getTestSeq() {
		return testSeq;
	}
	public void setTestSeq(int testSeq) {
		this.testSeq = testSeq;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestContent() {
		return testContent;
	}
	public void setTestContent(String testContent) {
		this.testContent = testContent;
	}
	
	
}
