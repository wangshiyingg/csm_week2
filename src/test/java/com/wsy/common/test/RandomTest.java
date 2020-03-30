package com.wsy.common.test;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.wsy.common.utils.RandomUtil;

public class RandomTest {
	@Test
	public  void random(){
		int x = RandomUtil.random(1, 3);
		System.out.println(x);
	}
	@Test
	public  void subRandom(){
	 int[] x = RandomUtil.subRandom(1,10,3);
		for (int i : x) {
			System.out.println(i);
		}
	}
	@Test
	public  void randomCharacter(){
	char x = RandomUtil.randomCharacter();
	System.out.println(x);	
	}
	@Test
	public  void randomString(){
	 String x = RandomUtil.randomString(3);
	System.out.println(x);	
	}
}
