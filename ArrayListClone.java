import java.util.ArrayList;

public class ArrayListClone{
	
	public static void main(String[] args)
	{
		ArrayList<String> List = new ArrayList<String>();
		
		//add elements to the ArrayList
		List.add("JAVA");
		List.add("C++");
		List.add("PERL");
		List.add("PHP");
		List.add("SQL");
		List.add("XML");
    System.out.println("Original array list"+ List);
        
    ArrayList<String> listCopy = (ArrayList<String>) List.clone();
    System.out.println("cloned array is: "+ listCopy);
	}
}
