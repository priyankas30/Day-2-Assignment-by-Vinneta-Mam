//Write a Program to reverse a string without using String inbuilt function.
//using for loop
package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string");
		s=sc.nextLine();
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0 ;--i) {
			System.out.print(s.charAt(i-1));
		}

	}

}
