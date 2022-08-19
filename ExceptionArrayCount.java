package git;
import java.util.*;

public class ExceptionArrayCount {

	void countVowels(String str) {
		int strLength= str.length();
		
		char []arr= new char[strLength];
		int i;
		for(i=0;i<strLength;i++) {
			arr[i]=str.charAt(i);
			
		}
		System.out.print("The array is: ");
		for(i=0;i<strLength;i++) {
			System.out.print(" "+ arr[i]+" ");
		}
		System.out.println(" ");
		
		
		int count=0;
		System.out.print("The vowels: ");
		for(i=0;i<strLength;i++) {
			if(arr[i]=='a'||arr[i]=='e'
					||arr[i]=='i'||arr[i]=='o'||
					arr[i]=='u') {
				System.out.print(" "+arr[i]+" ");
				count+=1;
				
			}
			
		}
		System.out.println(" ");
		System.out.println("The number of vowels: "+ count);
	}
}