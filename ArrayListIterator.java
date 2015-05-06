import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListItr{
 
    public static void main(String[] args){
    	
    	ArrayList<String> List = new ArrayList<String>();
      //adding elements to the end
    	List.add("First");
    	List.add("Second");
    	List.add("Third");
    	List.add("Random");
    	
      Iterator<String> itr = List.iterator();
      while(itr.hasNext())
      {
          System.out.println(itr.next());
      }
    }
}
