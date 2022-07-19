package lesson_1;

public class specifier_private {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priAccessSpecifier  obj = new priAccessSpecifier(); 
		

}
}
class priAccessSpecifier 

{ 
   private void dis() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

