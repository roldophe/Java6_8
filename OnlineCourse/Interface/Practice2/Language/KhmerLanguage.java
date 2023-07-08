package com.Radom.java.OnlineCourse.Interface.Practice2.Language;

public class KhmerLanguage implements Language{

	@Override
	public void greeting() {
		System.out.println("Suo Sdey");
	}

	@Override
	public void introduce(String name) {
		System.out.println("Khnom chhnus "+name);
		
	}

}
