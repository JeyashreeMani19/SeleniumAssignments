package week1.day2_assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int input=37;
		boolean isPrime = true;
		for (int i = 2;i<input; i++)
		{
			if (input%i == 0)
			{
				isPrime = false;
				System.out.println( input + " is not prime number");
				break;
			}
		}
		if (isPrime)
		{
			System.out.println( input + " is prime Number");
		}
	}

}
