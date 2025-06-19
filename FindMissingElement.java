package week3.day1_assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input=  {1, 4,3,2,8, 6, 5}; 
		//Sort the input array
		Arrays.sort(input);
		
		//iterate for the missing element
		for (int i=1; i<=input.length; i++)
		{
			if (i != input[i-1])
			{
				System.out.println("Missing Element is "+i);
				break;
			}
		}

	}

}
