package com.example.restendpointget.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {
	
	@RequestMapping("/course")
	public Course getEndpoint(@RequestParam(value = "name" , defaultValue = "Spring - boot",required = false) String name,
			                  @RequestParam(value = "chaptercount",defaultValue = "2", required = false) int chapterCount) {
		return new Course(name,chapterCount);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/register/course")
	public String saveCourse(@RequestBody Course course) {
		return "Your course named" + course.getName() + "chapter count = "+course.getChaptercount()+" has been successfully saved";
	}

}
