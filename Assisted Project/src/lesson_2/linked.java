package lesson_2;
import java.util.*;


public class linked {
	
	public static void main(String[]args)
	{
		Map<String,Integer>map=new LinkedHashMap<>();
		
		
		map.put("sapna",10 );
		map.put("suki", 20);
		map.put("subi", 30);
		for(Map.Entry< String, Integer>e:map.entrySet())
			System.out.println(e.getKey() + "  "+e.getValue());
		   
	}

}



