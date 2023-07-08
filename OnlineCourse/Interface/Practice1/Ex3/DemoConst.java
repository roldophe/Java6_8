package com.Radom.java.OnlineCourse.Interface.Practice1.Ex3;

public class DemoConst implements Mycost{

	public static void main(String[] args) {
		int num[] = new int[MAX];
		for(int i=MIN; i<23; i++) {
			if(i>MAX)
				System.out.println("SMSERROR");
			else
				num[i]=i*i;
				System.out.println("Num["+i+"]="+num[i]);
		}
	}

}
