package week3.day1_assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="We learn Java basics as part of java sessions in java week1";
		//converting the input string to string array with space delimiter
		String[] input_words; 
		int duplicate_count = 0;
		input_words = input.split(" ");
		
		//Iterate each word with the others words in the String to check for duplication
		
		for (int i = 0 ;i< input_words.length; i++)
		{
			for (int j=i+1; j< input_words.length; j++)
			{
				//if it matches then replace with Empty String
				if (input_words[i].equalsIgnoreCase(input_words[j]))
				{
					duplicate_count += 1;
					input_words[j] ="";
				}
			}
		}
		//Print the changed output
		if (duplicate_count > 0)
		{
			for (int i =0 ;i < input_words.length; i++)
			{
				System.out.print(input_words[i] + " ");
			}
		}
	}

}
