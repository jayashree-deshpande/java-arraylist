import java.util.ArrayList;

public class BasicArrayList{
	
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
    		System.out.println(myList);
        
    		//get elements by index
    		System.out.println("Element at index 2 is: "+ myList.get(2));
		//to find if an element is in the list or not
    		System.out.println("Does the list contains 'JAVA'?: " +myList.contains("JAVA"));
    		//add elements at a specific index
    		myList.add(2,"PLAY");
    		System.out.println(myList);
    		System.out.println("Is this list empty? "+ myList.isEmpty());
    		System.out.println("Index of PERL is "+ myList.indexOf("PERL"));
    		System.out.println("Size of the arraylist is: "+ myList.size());
    		myList.remove(1);
    		System.out.println("After removing 'C++' from the list "+myList);
        
	}
}
