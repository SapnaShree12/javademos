package lesson_2;

public class call {
	

		int val=1500 ;

		int operation(int val) {
			val =val*100;
			return(val);
		}


		public static void main(String args[]) {
			call d = new call();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			}
		}


