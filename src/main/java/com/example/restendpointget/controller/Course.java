package com.example.restendpointget.controller;

public class Course {
	
	private String name;
	private int chaptercount;
	
	public Course(String name, int chaptercount) {
		super();
		this.name = name;
		this.chaptercount = chaptercount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChaptercount() {
		return chaptercount;
	}

	public void setChaptercount(int chaptercount) {
		this.chaptercount = chaptercount;
	}
	
	
	

}
