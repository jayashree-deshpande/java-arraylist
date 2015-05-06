import java.util.ArrayList;

public class DeleteArrayList{
	
	public static void main(String[] args)
	{
		ArrayList<String> myList = new ArrayList<String>();
		
		//add elements to the ArrayList
		myList.add("JAVA");
		myList.add("C++");
		myList.add("PERL");
		myList.add("PHP");
		myList.add("SQL");
		myList.add("XML");
        
    System.out.println("Actual ArrayList:"+myList);
    myList.clear();
    System.out.println("After clear ArrayList:"+myList);

	}
}
