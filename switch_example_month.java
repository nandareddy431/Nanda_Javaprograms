package basicprograms;

import java.util.Scanner;

public class switch_example_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
int number_of_daysinmonth=0;
String monthofname="unknown";
System.out.println("input of a month number:");
int month=input.nextInt();
System.out.println("input a year");
int year=input.nextInt();
switch(month)
{
case 1:
	monthofname="january";
	number_of_daysinmonth=31;
	break;
case 2:
	monthofname="february";
	if((year % 400 ==0)||((year%4==0)&&(year%100 !=0)))
	{
	number_of_daysinmonth=29;
	}
	else
	{
	number_of_daysinmonth=28;
	}
case 3:
	monthofname="march";
	number_of_daysinmonth=31;
	break;	
case 4:
	monthofname="april";
	number_of_daysinmonth=30;
	break;	
case 5:
	monthofname="may";
	number_of_daysinmonth=31;
	break;	
case 6:
	monthofname="june";
	number_of_daysinmonth=30;
	break;	
case 7:
	monthofname="july";
	number_of_daysinmonth=31;
	break;
case 8:
	monthofname="august";
	number_of_daysinmonth=31;
	break;		
case 9:
	monthofname="september";
	number_of_daysinmonth=30;
	break;	
case 10:
	monthofname="october";
	number_of_daysinmonth=31;
	break;	
case 11:
	monthofname="november";
	number_of_daysinmonth=30;
	break;	
case 12:
	monthofname="december";
	number_of_daysinmonth=31;	
}
System.out.println(monthofname +" " + year + " "+"has" +" " + number_of_daysinmonth +" "+"days");

	}

}
