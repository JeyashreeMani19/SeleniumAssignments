package week3.day1_assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="changeme";
		//Converting the string to array
		char[] inputa=input.toCharArray();
		String output ="";
		
		//Iterating and changing the odd number to upperCase
		
		for (int i =0; i<inputa.length; i++)
		{
			if (i%2 ==0)
			{
				output +=inputa[i];
			}
			else
			{
				output += Character.toUpperCase(inputa[i]);
			}
		}
		System.out.println(output);
	}

}
