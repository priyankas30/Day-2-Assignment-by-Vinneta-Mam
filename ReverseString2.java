//Write a Program to reverse a string without using String inbuilt function.
//using while loop
package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String");
		s=sc.next();
		System.out.println("Reverse string is: ");
		int i=s.length();
		while(i > 0) {
			System.out.println(s.charAt(i-1));
			i--;
		}
	}

}
