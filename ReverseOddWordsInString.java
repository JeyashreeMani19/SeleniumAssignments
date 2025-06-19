package week3.day1_assignment;

public class ReverseOddWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		ReverseString rev_str = new ReverseString();
		String reverseString;
		String[] input_words;
		// Split the string with space delimiter
		input_words = input.split(" ");
		
		//Iterate through each words and reverse the odd position String
		for (int i=0; i< input_words.length ; i++)
		{
			if (i %2 !=0)
			{	
				//Calling the class to reverse the given String
				char[] output=rev_str.string_reverse(input_words[i]);
				reverseString=new String(output);
				input_words[i]=reverseString;
			}
		}
		for (int i=0; i< input_words.length ; i++)
		{
			System.out.print(input_words[i]+" ");
		}

	}

}
