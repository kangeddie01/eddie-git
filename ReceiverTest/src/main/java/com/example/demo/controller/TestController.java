package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.TestMapper;

@RestController
public class TestController {

	
    @Autowired
    private TestMapper testMapper;
    
    
	@RequestMapping("/test")
	public void test() {
		System.out.println("testtest");
		
		testMapper.selectData();
	}

}
