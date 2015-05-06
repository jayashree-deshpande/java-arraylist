/**
 * copying another collection instance objects to existing ArrayList
**/

import java.util.ArrayList;
import java.util.List;

public class ListtoArrayList{
	
	public static void main(String[] args)
	{
		ArrayList<String> myArrayList= new ArrayList<String>();
		
		//add elements to the ArrayList
		myArrayList.add("JAVA");
		myArrayList.add("C++");
		myArrayList.add("PERL");
		myArrayList.add("PHP");
		myArrayList.add("SQL");
		myArrayList.add("XML");
    System.out.println("Before copy"+ myArrayList);
        
    List<String> list = new ArrayList<String>();
    list.add("One");
    list.add("Two");
        
    myArrayList.addAll(list);
    System.out.println("After Copy: "+ myArrayList);
        
        
	}
}
