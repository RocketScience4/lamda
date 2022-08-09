package lamda;

import java.util.ArrayList;

public class BrushupCoreconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// general
		int myNum = 5;
	
        double dec = 0.21;
        
        char letter = 'f';
        
        boolean check = true;
        
    	String website = "Im cool";
    	
        System.out.println(myNum + "is printed against myNum");
        System.out.println(website);
        
        
        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        
        int[] arr2 = {1,2,3,4,5, 112, 8787, 9897, 98, 6,9,8,10, 866,980};
        
        System.out.println(arr2[0]);
        
        
        //loops
        
        for(int i =0;  i<arr2.length; i++)
        {
        	
        	System.out.println(arr2[i]);
        }
        
        String[] aar3 = {"my", "good", "lad"};
        for(int i =0; i<aar3.length; i++) {
        	
        	System.out.println(aar3[i]);
        }
        
        
        // if  condition in loops
        int[] arr4 = {1,2,3,4,5, 112, 8787, 9897, 98, 6,9,8,10, 866,980};
        // check if array has multiple of 2
        for(int i =0; i<arr4.length; i++) 
        {
        	
        	if(arr4[i] % 2 == 0) {
        		System.out.println(arr4[i]);
        		break;
        		}
        	
        	else {
        		System.out.println(arr4[i] + " is not a multiple of 2");
        	}
        }
        
        //*Arraylist
        
        ArrayList<String> s = new ArrayList<String>();
        s.add("brushup");
        s.add("jae");
        s.add("concepts");
        s.add("and");
        s.add("whatnot");
        System.out.println(s.get(3));
        
        
        // Declare strings, can be declared using new method also can be declared using string literal. 
        // What is a string, String is an object. 
        
        String s01 = "One way to declare string";
        
        String s02 = new String("Another way to declare string");
        
        //String Array
        
        
      String w = "Lets declare an arrray of a string";
      String[] splittedString = w.split("an");
      
      System.out.println(splittedString[0]);
      System.out.println(splittedString[1]);
      System.out.println(splittedString[2]);
      System.out.println(splittedString[3].trim());
      
      
        
        
        	
	}

}
