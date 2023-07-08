package com.Radom.java.OnlineCourse.Enum;

import java.util.EnumSet;

public class EnumSetDemo {
	public static void main(String[] args) {
		/*
		Set<Size> size = new HashSet<>();
		size.add(Size.SMALL);
		size.add(Size.MEDIUM); 
		size.add(Size.LARGE);
		size.add(Size.EXTRALARGE);
		System.out.println(size);
		*/
		//EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		//System.out.println(sizes);
		
		
		System.out.println(Size.getALL());
		
		
		EnumSet<Size> set = EnumSet.noneOf(Size.class);
		set.add(Size.MEDIUM);
		System.out.println(set);
		
		EnumSet<Size> range = EnumSet.range(Size.SMALL, Size.EXTRALARGE);
		System.out.println(range);
		
		EnumSet<Size> of = EnumSet.of(Size.MEDIUM,Size.LARGE);
		System.out.println(of);
		
		
	}
}
