package com.wsy.common.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.wsy.common.utils.RandomUtil;
import com.wsy.common.utils.StringUtil;

public class PersonTest {
	@Test
	public void test01()
	{
		for (int i = 0; i <= 10000; i++) {
			Person p=new Person();// 创建person对象
			p.setName(StringUtil.generateChineseName());//赋值
			p.setAge(RandomUtil.random(1, 120));//赋值
			p.setAbout(StringUtil.randomChineseString(140));//赋值
			Calendar c=Calendar.getInstance();
			c.set(2010,0,1);
			Date date=RandomUtil.randomDate(c.getTime(), new Date());
			p.setCreated(date);
			System.out.println(i+" "+p);
		}
	}
}
