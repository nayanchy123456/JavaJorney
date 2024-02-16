package javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating list
		List<String> list = new ArrayList<String>();
		
		// adding the list elements
		list.add("mango");
		list.add("orange");
		list.add("apple");
		list.add("banana");
		
		// converting the list into array
		
		String array[]  =list.toArray(new String[list.size()]);
		
		// displaying the list elements
		
		for(String fruits:list)
		{
			System.out.println(fruits);
	}

//	2	for(int i = 0; i<list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}

		 
	}

}
