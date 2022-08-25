package git;

import java.util.Scanner;

public class Que1_TestingClass {
	String display() 
	{
		
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the string ");
	  String inputString = sc.nextLine();
	  if (inputString.length() > 4) {
            String ExceptLast4 = inputString.substring(0, inputString.length()-4);
            String repeatString = "X".repeat(ExceptLast4.length());
            repeatString +=  inputString.substring(inputString.length()-4);
            System.out.println(repeatString);
        }
        else {
            System.out.println("Entered string must be greater than 4.");
        }
	  sc.close();
	  return toString();
        
    }
 
    public static void main(String[] args)  {
    	
    	Que1_TestingClass obj=new Que1_TestingClass();
    	obj.display();
    	
 
       
         
    }
 
}
/*Enter the string 
*9812343348
*XXXXXX3348
*/