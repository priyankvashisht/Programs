package git;
public class Shape1 {
	public void print_shape()
	{
		System.out.println("This is a shape");
	}
}

 class Rectangle1 extends Shape1
{
	public void print_rec()
	{
		
		System.out.println("This is a rectangle");
	}
}
 class Circle extends Shape1
 {
	 public void print_circle()
	 {
		 
	 }
 }
 class Square1 extends Rectangle1
{
	public void print_square()
	{
		
		System.out.println("Square is a rectangle");
	}
}