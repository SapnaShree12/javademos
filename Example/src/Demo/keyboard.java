package Demo;

public class keyboard {
	
	    public static void main(String args[]) {
	        //int abc[10];    //valid in C or C++ but not in java 
	        int abc[];        // valid in java 
	        int xyz[]={10,20,30,40,50,60,100,200,140,670,80,90};
	        System.out.println("Value of 0 index position "+xyz[0]);
	        System.out.println("Value of 1 index position "+xyz[1]);
	        System.out.println("Size of the array is "+xyz.length);
	        System.out.println("Retrieve the value using for loop");
	        for(int i=4;i<xyz.length;i++) {
	            System.out.println(xyz[i]);
	        }
	        System.out.println("Retrieve the value using for each loop");
	        for(int n : xyz) {
	                System.out.println(n);
	        }
	    }
	}


