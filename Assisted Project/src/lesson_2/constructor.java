package lesson_2;
class employee{
	int id;
	String name;
	employee(int id,String name){
	this.id=id;
	this.name=name;
}
	void display()
	{
		System.out.println(id+ "  "+name);
	}
}
public class constructor {
	public static void main(String args[]) {
		employee a=new employee(123,"sapna");
		a.display();
	}

}
