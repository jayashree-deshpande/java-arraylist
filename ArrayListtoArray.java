import java.util.ArrayList;
 
public class ArrayListtoArray {
	
	public static void main(String a[]){
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("First");
		myArrayList.add("Second");
		myArrayList.add("Third");
		myArrayList.add("Random");
		
        System.out.println("Original ArrayList:"+myArrayList);
        
        String[] myArray = new String[myArrayList.size()];
        myArrayList.toArray(myArray);
        
        System.out.println("myArray content:");
        for(String str:myArray){
            System.out.println(str);
        }
    }
}
