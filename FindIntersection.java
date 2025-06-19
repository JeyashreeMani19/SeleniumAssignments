package week3.day1_assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[]= {3,2,11,4,6,7};
		int input2[]={1,2,8,4,9,7};
		
		//Iterate with the first array
		System.out.println("Matching number in both array");
		
		for (int i =0; i< input1.length; i++)
		{
			//iterate with the second array
			for (int j=0; j<input2.length; j++)
			{
				//check for matching number 
				if(input1[i]==input2[j])
				{
					System.out.println(input1[i]);
				}
			}
		}

	}

}
