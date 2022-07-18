package Demo;
import java.util.Scanner;

public class display {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,a;
		System.out.println("enter the number : ");
		n=sc.nextInt();
		
		int fact=1;
		//for(int i=1;i<=n;i++)
			//fact=fact*i;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("the factorial is  " +fact);
	}

}
