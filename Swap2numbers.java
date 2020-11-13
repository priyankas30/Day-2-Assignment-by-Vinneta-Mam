package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class Swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("before Swapping :"+a+" "+b);
		c=a;
		a=b;
		b=c;
		
		System.out.print("after Swapping :"+a+" "+b);

	}

}
