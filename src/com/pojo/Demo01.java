package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

	public static String method01() {

		Demo demo = new Demo();

		User user = new User();

		user.setId(1);
		user.setUsername("修改");
		user.setPassword("123456");
		user.setAge(20);
		
		List<User> list = new ArrayList<User>();
		
		list.add(user);
		
		demo.setId(1);
		demo.setName("yu666");
		demo.setAge(20);
		demo.setLists(list);
		
		String name = demo.toString();
		
		return name;

	}

}
