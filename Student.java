package com.entity;

public class Student {

	private int S_id;
	private String S_name;
	private int S_age;
	private String S_city;
	
	private Country con;
	
	public Student() {
		
	}

	public Student(int s_id, String s_name, int s_age, String s_city, Country con) {
		super();
		S_id = s_id;
		S_name = s_name;
		S_age = s_age;
		S_city = s_city;
		this.con = con;
	}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public int getS_age() {
		return S_age;
	}

	public void setS_age(int s_age) {
		S_age = s_age;
	}

	public String getS_city() {
		return S_city;
	}

	public void setS_city(String s_city) {
		S_city = s_city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", S_name=" + S_name + ", S_age=" + S_age + ", S_city=" + S_city + ", con="
				+ con + "]";
	}
	
	
}
