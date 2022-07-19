package lesson_2;

public class overLoading {
	
		
		public void add(int c,int d)
		    {
		         System.out.println("sum of two number : "+(c+d));
		    }
		    public void sub(int x,int y,int z) 
		    {
		         System.out.println("differnce of three number : " +(x-y-z));
		    }

		    public static void main(String args[])
		   {

		overLoading a=new overLoading();
		       a.add(10,12);
		       a.sub(5,10,15);  
		   }

}
