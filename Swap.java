package com.tk.tcs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b values:");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"b="+b);
	}


}
