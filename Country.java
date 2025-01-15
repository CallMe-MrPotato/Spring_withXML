package com.entity;

public class Country {

	private int C_id;
	private String C_name;
	
	public Country() {
		
	}

	public Country(int c_id, String c_name) {
		super();
		C_id = c_id;
		C_name = c_name;
	}

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	@Override
	public String toString() {
		return "Country [C_id=" + C_id + ", C_name=" + C_name + "]";
	}
	
}
