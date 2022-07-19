package lesson_2;
import java.io.*;
import java.util.*;


public class collection {
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("Sapna");//
	      name.add("Suki");    	   
	      System.out.println(name);  
		
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(45); 
	      vec.addElement(80); 
	      System.out.println(vec);
		
		
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(14);  
	       set.add(15);  
	       set.add(16);
	       set.add(17);
	       System.out.println(set);
	       
	}
}
