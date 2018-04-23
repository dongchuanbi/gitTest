package com.neon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.service.FirsetService;

import io.swagger.annotations.ApiOperation;
//@RestController
@Controller
public class NumberOneController {
	@Autowired
	private FirsetService firsetService; 
	@ApiOperation(value="测试方法一", notes="一呀")
	@ResponseBody
	@RequestMapping("/oneMethod.do")
	public String oneMethod(){
		String ha="haha";
		return ha;
	}
	@ApiOperation(value="测试方法二", notes="二呀")
	@RequestMapping("/twoMethod.do")
	public String twoMethod(){
		
		return "haha";
	}
	@ApiOperation(value="测试方法三", notes="三呀")
	@ResponseBody
	@RequestMapping("/threeMethod.do")
	public int threeMethod(){
		int aa=firsetService.firstMethod(); 
		return aa;
	}
}
