package com.wsy.common.test;

import org.junit.jupiter.api.Test;

import com.wsy.common.utils.RandomUtil;
import com.wsy.common.utils.StringUtil;

public class StringTest {
	@Test
	public  void hasLength(){
	boolean x = StringUtil.hasLength("ss");
	System.out.println(x);	
	}
	@Test
	public  void hasText(){
	boolean x = StringUtil.hasLength("ss");
	System.out.println(x);	
	}
	@Test
	public  void randomChineseString(){
	String x = StringUtil.randomChineseString(3);
	System.out.println(x);	
	}
	@Test
	public  void generateChineseName(){
	String x = StringUtil.generateChineseName();
	System.out.println(x);	
	}
}
