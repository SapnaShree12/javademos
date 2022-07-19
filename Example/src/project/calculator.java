package project;

import java.util.Scanner;

public class calculator {

	public static void main(String args[]) {
		int a, b, e;
		

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the first value");
		a = obj.nextInt();
		System.out.println("enter the second value");
		b = obj.nextInt();
		calculation cal = new calculation(a, b);
		System.out.println("enter the choice 1.addition 2.subtraction 3.multiplication 4.division ");
		e = obj.nextInt();
		cal.perform(e);

	}
}

	final class calculation {

		int a, b;
		
		calculation(int a, int b) {
			this.a = a;
			this.b = b;
		}
	

		

		void perform(int d){
		 
		switch(d) {
     case 1:System.out.println("the sum of two number is " +(a+b));
             break;
     case 2:System.out.println("the difference of two number is " +(a-b));
             break;
     case 3:System.out.println("the multiplication of two number is "  +(a*b));
             break;
     case 4:System.out.println("the division of two number is " +(a/b));
             break;
     default : System.out.println("wrong choices");
             break;
 }
		}
	}
     

