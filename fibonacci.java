package basicprograms;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n1=0,n2=1,n3,count=10;
		for(i=1;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}

	}

}
