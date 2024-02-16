package javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array [] = {"mango","apple","banana","orange" };
		System.out.println( "The array elements are: " + Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		for(String conv:array) // iterating the loop in array and storing into variable conv. and adding the conv into list
		{
			list.add(conv);
		}
		System.out.println("The list elements are:" + list); // displaying the list elements
		
	}

}
