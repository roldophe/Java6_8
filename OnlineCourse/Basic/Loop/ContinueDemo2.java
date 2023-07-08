package com.Radom.java.OnlineCourse.Basic.Loop;

import java.util.Scanner;

public class ContinueDemo2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input n value: ");
			int n = input.nextInt();
			
			String text = " ";
			for (int i = 0; i < n; i++) {
				System.out.print("Word-" + (i + 1) + " : ");
				String word = input.next();
				
				int lastIndex = word.length() - 1;
				char lastLetter = word.charAt(lastIndex);
				char ch = Character.toLowerCase(lastLetter);
				
				if (Character.isAlphabetic(lastLetter)) {
					if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
						text += word + " ";
					}
				}//endIf
				
			}//endClass
			
			System.out.println(text);
		}

		/*
		 * String t="School"; int lastindex=t.length()-1;
		 * System.out.print(t.charAt(lastindex));
		 */

		/*
		 * char ch='a';
		 * 
		 * //System.out.print(Character.isAlphabetic(ch));
		 * if(Character.isAlphabetic(ch)) { if(ch!='a' && ch!='e' && ch!='i' && ch!='o'
		 * && ch!='u') { System.out.print("Consonant"); } else {
		 * System.out.print("Vowel"); } }
		 */
	}

}
