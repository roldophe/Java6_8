package com.Radom.java.OnlineCourse.OPP.Inheritance.StaticKeyWordDemo;

public enum Grade {
ONE(1), TWO(2), THREE(3);

	private int value;

	public int getValue() {
		return value;
	}
	private Grade(int value) {
		this.value=value;
	}
}
