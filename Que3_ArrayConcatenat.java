package git;

public class Que3_ArrayConcatenat {

	static void joinArr(String st[],int arr[])
	{
		System.out.println("Names\tMarks\n");
		for(int i=0;i<st.length;i++)
		{
				System.out.println(st[i]+"\t"+arr[i]);
		}
	}
	public static void main(String[] args) {

		String str[] = {"Priyank","Karan","Jatin","Rahul","Akshay"};
		

		int a[] = {25,30,32,25,30};
		

		joinArr(str,a);
	}

}

/*Names	Marks

Priyank	25
Karan	30
Jatin	32
Rahul	25
Akshay	30
*/