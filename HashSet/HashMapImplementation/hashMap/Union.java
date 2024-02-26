package hashMap;

import java.util.HashSet;

public class Union {
	
	public static int FindUnion(int arr1[], int arr2[])
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i< arr1.length; i++)
		{
			set.add(arr1[i]);
		}
		for(int j=0; j< arr2.length; j++)
		{
			set.add(arr2[j]);
		}
		
		 return set.size();
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		Union u = new Union();
		System.out.println(u.FindUnion(arr1, arr2));
		
	}

}
