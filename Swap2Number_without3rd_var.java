package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class Swap2Number_without3rd_var {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before Swapping :"+a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swapping :"+a+ " "+b);

		

	}

}
