package Array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list); 
		
		// get
		int num = list.get(2);
		System.out.println(num);
		
		//add in certain position 
		 list.add(0, 5);
		 
		 System.out.println(list);
		 
		// set
		 list.set(0, 1);
		 System.out.println(list);
		 
		 // remove
		 list.remove(0);
		 System.out.println(list);
		 // loops 
		 for(int i=0; i<list.size(); i++)
		 {
			 System.out.println(list.get(i));
		 }
		 
		
		

	}

}
