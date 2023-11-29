package basicprograms;

import java.util.Scanner;

public class polyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,rev=0,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value");
		num=sc.nextInt();
        d=num;	
		while(num!=0)
		{
		r=num%10;
		rev=rev*10+r;
		num=num/10;	
		}
		if(d==rev)
		{
         System.out.println("given number is polyndrome");
		}
		else
		{
			System.out.println("given number is not reversed number");
		}
	}

}
