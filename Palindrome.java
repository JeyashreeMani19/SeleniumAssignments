package week1.day2_assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =124;
		int output = 0;
		for (int i=input;i>0; )
		{
			output = output*10;
			output = output + i%10;
			i = i/10;
		}
		if (input == output)
		{
			System.out.println(input + " is Palindrome");
		}
		else
		{
			System.out.println(input + " is NOT Palindrome");
		}
	}

}
