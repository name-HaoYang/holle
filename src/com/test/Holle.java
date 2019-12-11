package com.test;

import com.pojo.User;

public class Holle {

	public static void main(String[] args) {
		
		System.out.println("holle");
		
		String test = method1();
		
		System.out.println(test);
		
	}
	
	public static String method1() {
		
		User user = new User();
		
		user.setId(1);
		user.setUsername("修改");
		user.setPassword("123456");
		user.setAge(20);
		
		String test = user.toString();
		
		return test;
		
	}

}
