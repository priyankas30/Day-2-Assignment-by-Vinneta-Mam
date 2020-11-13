package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class Count_words {

	public static void main(String[] args) {
		String s="Welcome to cdac";
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		for(int i=0; i<s.length()-1;i++) {
			if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i-1)) && i>0) {
				count++;
		}
	}
		count++;
		System.out.println("count is :"+count);
	}

}
