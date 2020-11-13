package Vinita_maam_Assignment_1;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		int num,i;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		for(i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
			
		}
	//	boolean flag;
		if(!flag) {
			System.out.println(num+ " Prime number");
			
		}
		else {
			System.out.println(num+ " not Prime number");
		}

	}

}
