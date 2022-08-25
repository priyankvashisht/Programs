package git;

public class Que2_TestingString {
	//accept  String array 
	static String strConcat(String st[])
	{
		StringBuilder builder = new StringBuilder();;
		try {
			if(st==null) {
				throw new Exception();
			}


			for(String a : st) {

				builder.append(a+" ");
			}
		}catch(Exception x)
		{

			System.out.print("Array Cannot Null");
		}

		return builder.toString();
	}
	public static void main(String[] args) {
//		 three array of Strings
		String st1[]= null;
		String st2[]= {"Priyank" , "Vashisht"};
		String st3[]= {"Learning","Java","From","Anudip"};

		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}

}
/*Names	Marks

Array Cannot Null
Priyank Vashisht 
Learning Java From Anudip 

*/