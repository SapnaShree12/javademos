package lesson_2;
import java.util.regex.*;

public class regular {




public static void main(String[] args) {

	String words = "[a-z]+";
	String check = "Good day";
	Pattern p = Pattern.compile(words);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
