package arrayquestions;
//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
public class Question3 {
	float sum =0;
	float avg;
	float marks [] = {9.7f,9.1f,5.7f,6.7f,9.8f};
	public static void main(String[] args)
	{
		Question3 q3 = new Question3();
		q3.calAvgMarks();
	}
	
	
	public void calAvgMarks()
	{
		for(int i=0; i<5; i++)
		{
			 sum+= marks[i];
		}
		avg = sum/5;
		System.out.println("the avg marks is:" + avg);
	}
	
	

}
