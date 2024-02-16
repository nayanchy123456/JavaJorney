package javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("oragne");
		
		for(String fruit:list) // displaying the elements
		{
			System.out.println(fruit);
		}
		
		String array[] = list.toArray( new String[list.size()]); // converting the list into array
		System.out.println(Arrays.toString(array)); // displaying the elements of array
													// we can iterate to display the elements of array
		

	}

}
