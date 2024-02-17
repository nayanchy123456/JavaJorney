package arrayquestions;
//Write a program to find out whether a given integer is present in an array or not.
public class Question2 {
	
	boolean isInArray = false;
	int arr[] = {2,4,6,7,6};
	public static void main(String []  args)
	{
		Question2 q1 = new Question2();
		q1.findArr(70);
	}
	
	public void findArr(int num)
	{
		for(int i=0; i<5; i++)
		{
			if(arr[i] == num)
			{
				isInArray = true;
				break;
			}
		
			
		}
		if(isInArray == false)
		{
			System.out.println(num + " " +" is not present");
		}
		else
		{
			System.out.println(num + " " +" is  present");
		}
	}
}
