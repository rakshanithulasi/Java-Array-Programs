package basic;

import java.util.Scanner;

public class CountEvenAndOddElements 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count : " + oddCount);
		sc.close();
	}
}
