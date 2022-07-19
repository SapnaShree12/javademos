package lesson_1;

 class specifier_pub {
public static void main (String[]args)
{
	System.out.println("public");
	A obj= new A();
	obj.display();
	
}
 }

 class A
{
	public void display()
	{
		System.out.println("public");	}
	}
