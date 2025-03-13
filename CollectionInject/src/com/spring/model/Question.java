package com.spring.model;

import java.util.List;

public class Question {

	private int qid;
	private String qname;
	private List<String> answers;

		public Question(int qid, String qname, List<String> answers) 
		{
		super();
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", answers=" + answers + "]";
	}
	
	
}
