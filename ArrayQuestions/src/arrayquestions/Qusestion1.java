package arrayquestions;
//Create an array of 5 floats and calculate their sum.
public class Qusestion1 {
		float sum =0;
		float arr [] = {2.2f,4.3f,6.4f,8.5f,7.5f};
		public static void main(String[] args)
		{
			Qusestion1 q = new Qusestion1();
			q.calSum();
		}
		
		public void calSum()
		{
			for(int i=0; i<5; i++)
			{
				sum += arr[i];
			}
			System.out.println("the sum of array is:" + sum);
		}
}
