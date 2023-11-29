package basicprograms;

import java.util.Scanner;

public class productusingfloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,product;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		num1=sc.nextDouble();
		System.out.println("enter second number");
		num2=sc.nextDouble();
		sc.close();
		product=num1*num2;
		System.out.println("product of two numbers :"+product);
	}

}
