package com.Radom.java.OnlineCourse.Enum;

import java.util.EnumSet;
import java.util.Set;

public enum Size {
	SMALL, MEDIUM, LARGE, EXTRALARGE, EX2;

	public static Set<Size> getALL() {
		/*
		Set<Size> sizes = new HashSet<>();
		sizes.add(Size.SMALL);
		sizes.add(Size.MEDIUM);
		sizes.add(Size.LARGE);
		sizes.add(Size.EXTRALARGE);
		*/
		return EnumSet.allOf(Size.class);
	}
}
