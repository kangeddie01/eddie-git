package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.TestMapper;

@RestController
public class TestController {

	
    @Autowired
    private TestMapper testMapper;
    @RequestMapping("/")
   	public void index() {
   		System.out.println("index");
   		
   		System.out.println(testMapper.selectData());
   	}
    
	@RequestMapping("/test")
	public void test() {
		System.out.println("testtest");
		
		testMapper.selectData();
	}

}
