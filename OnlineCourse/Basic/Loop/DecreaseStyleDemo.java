package com.Radom.java.OnlineCourse.Basic.Loop;

public class DecreaseStyleDemo {

	public static void main(String[] args) {
		//1 2 3 4 5
		
		/*int i=1;
		 * while(i<=5)
			{
				System.out.println(i);
				i++;
			}
		 */
		
		//int n=5;// 5 4 3 2 1
		
		/*while(n>0)
		{
			System.out.println(n);
			n--;
		}*/
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		for(int i=10; i>=1; i--)
		{
			for(int j=i-1; j>=1; j--)
				System.out.print("*");
			System.out.println("");
		}
		
	}

}
