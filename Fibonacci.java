package week1.day2_assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int j = 1;
		int i = 0;
		int k;
		for (int x=0;x<range-1;x++)
		{
			if ( x==0)
			{
				System.out.print(i +"," + j);
				continue;
			}
			k = i + j;
			System.out.print("," + k);
			i=j;
			j = k;
			//System.out.println(j);
		}
	}

}
