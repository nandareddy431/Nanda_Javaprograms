package basicprograms;

import java.util.Scanner;

public class naturalnumberssum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count, total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		num = sc.nextInt();
		sc.close();
		for(count=1;count<=num;count++)
		{
			total=total+count;
		}
		System.out.println("sum of first n natural numbers :"+total );
	}

}
