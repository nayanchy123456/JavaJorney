package hashset;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<> ();
		
		// adding the elements
		set.add(1);
		set.add(3);
		set.add(5);
		
		// remove elements
		set.remove(1);
		
		// search/ contains
		if(set.contains(3)) // if number is present reutrns true
		{
			System.out.println("contains 1");
		}
		if(!set.contains(1))
		{
			System.out.println("doesnot contains 1");
		}
		
		// size of set
		int size = set.size();
		System.out.println("size of set is" + " " + size);
		
		//print all elements 
		System.out.println(set);
		
		// iterator
		Iterator it = set.iterator();
		while(it.hasNext()) // checks the next elements and return true if present
		{
			System.out.println(it.next()); // print the next elements
		}
		
		
	}
}
