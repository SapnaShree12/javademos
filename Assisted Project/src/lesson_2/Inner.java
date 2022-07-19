package lesson_2;

public class Inner {
	
	public static void main (String args[]) {
		outer.inner in=new outer().new inner();
		in.show();
	}

}
class outer{
	class inner{
		public void show()
		{
			System.out.println("its a inner class");
		}
	}
}