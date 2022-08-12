package git;

import java.util.Scanner;

public class Factorial
{
	void show()
	{
	int fact=1;
	System.out.println("Enter the number: ");
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of  "+number+" is: "+fact);

	}
	
	public static void main(String args[])
	{
		Factorial f_no=new Factorial();
		f_no.show();
	}
}