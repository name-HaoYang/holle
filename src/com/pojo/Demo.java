package com.pojo;

import java.util.List;

public class Demo {

	private Integer id;
	private String name;
	private Integer age;
	private List<User> lists;

	public List<User> getLists() {
		return lists;
	}

	public void setLists(List<User> lists) {
		this.lists = lists;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", age=" + age + ", lists=" + lists + "]";
	}

}
