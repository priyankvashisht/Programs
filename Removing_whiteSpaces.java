package git;

public class Removing_whiteSpaces 
{
	void display()
	{
		String str="Hello we are learning java from Anudip Foundation";
		str=str.replaceAll("\\s+", "");
		
		System.out.println(str);
	}
	public static void main(String args[])
	{
		Removing_whiteSpaces  rws=new Removing_whiteSpaces ();
		rws.display();
	}
}