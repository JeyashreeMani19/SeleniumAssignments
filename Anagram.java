package week3.day1_assignment;

import java.util.Arrays;



public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="stops";
		String input2="potss";
		
		//Checking the input string length
		
		if (input1.length()!=input2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else
		{
			//convert string to char array
			char[] inputa=input1.toCharArray();
			char[] inputb=input2.toCharArray();
			//Sor the char array
			Arrays.sort(inputa);
			Arrays.sort(inputb);
			//Check if input is equal or not
			if(Arrays.equals(inputa, inputb))
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
				System.out.println("The given strings are not an Anagram");
			}
		}

	}

}
