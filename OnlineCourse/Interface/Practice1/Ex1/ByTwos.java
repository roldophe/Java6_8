package com.Radom.java.OnlineCourse.Interface.Practice1.Ex1;

public class ByTwos implements Series {

	int start;
	int val;

	public ByTwos() {
		this.start = 0;
		this.val = 0;
	}

	@Override
	public int getNext() {
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		start=0;
		val=0;
	}

	@Override
	public void setStart(int x) {
		start = x;
		val=x;
	}

}
