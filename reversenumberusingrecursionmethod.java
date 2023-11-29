package basicprograms;

import java.util.Scanner;

public class reversenumberusingrecursionmethod {

	
	public static void reverseMethod(int number)
	{
		if(number<10)
		{
			System.out.println(number);
			return;
		}
		else
		{
			System.out.println(number%10);
			reverseMethod(number/10);
		}
	}
	public static void main(String[] args) {
int number;
System.out.println("input any number");
Scanner sc = new Scanner(System.in);
number = sc.nextInt();
 System.out.println("reverse of the number");
 reverseMethod(number);
 System.out.println();
	}

}
