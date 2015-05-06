import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit{
	private String fruitName;
	private int quantity;
	
	public Fruit(String n, int q)
	{
		this.fruitName = n;
		this.quantity = q;
	}
	
	public String getName()
	{
		return fruitName;
	}
	
	public void setName(String name)
	{
		this.fruitName = name;
	}
	
	public int getQuantity() {
        return quantity;
    }
	
	public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
	public String toString(){
        return "Name: "+this.fruitName+"-- Quantity: "+this.quantity;
    }
}

class FQuantityComp implements Comparator<Fruit>{
	 
    @Override
    public int compare(Fruit f1, Fruit f2) {
        if(f1.getQuantity() > f2.getQuantity()){
            return 1;
        } else {
            return -1;
        }
    }
}
    
public class ArrayListSortUsingComparator{
     
    public static void main(String[] args){
         
        List<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("Apple",3000));
        list.add(new Fruit("Banana",6000));
        list.add(new Fruit("Oranges",2000));
        list.add(new Fruit("Tomates",2400));
        
        Collections.sort(list, new FQuantityComp());
        
        System.out.println("Sorted list entries: ");
        for(Fruit f:list){
            System.out.println(f);
        }
    }
}
