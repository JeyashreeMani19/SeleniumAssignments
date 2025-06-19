package week3.day1_assignment;

public class ReverseString {
	
	public char[] string_reverse(String input)
	{
		//Convert the inpout string to character array
		char[] output= new char[input.length()];
		int j =0;
		char[] input_char = input.toCharArray();
		// Reverse the input string and store it in an array
		for (int i = input_char.length -1 ; i >= 0 ; i--)
		{
			output[j]=input_char[i];
			j++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="TestLeaf";
		ReverseString rev_string = new ReverseString();
		char[] output= rev_string.string_reverse(input);
		
		for (int k=0; k<output.length; k++)
		{
			System.out.print(output[k]);
		}
		
	}

}
