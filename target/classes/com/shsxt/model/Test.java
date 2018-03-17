package com.shsxt.model;

public class Test {
	private String name;
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Test(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public Test() {
		super();
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", pwd=" + pwd + "]";
	}

}
