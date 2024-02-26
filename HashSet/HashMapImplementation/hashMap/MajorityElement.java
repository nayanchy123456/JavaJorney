package hashMap;

import java.util.HashMap;

// given an integer array of size n, find all elements that appear more than n/3; time
// nums[] = {1,3,2,5,1,3,1,5,1} // result  is  1 
public class MajorityElement {
	
	public static void IsMajorityElement(int nums[])
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		
		for(int key : map.keySet())
		{
			if(map.get(key) > nums.length /3)
			{
				System.out.println(key);
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		int nums [] = {1,3,2,5,1,3,1,5,1};
		MajorityElement  me = new MajorityElement();
		me.IsMajorityElement(nums);
	
	}
}
