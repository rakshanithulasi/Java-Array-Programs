package basic;

import java.util.Scanner;

public class CountPositiveNegativeAndZeroElements 
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
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > 0)
			{
				positiveCount++;
			}
			else if(arr[i] < 0)
			{
				negativeCount++;
			}
			else
			{
				zeroCount++;
			}
		}
		System.out.println("Positive : " + positiveCount);
		System.out.println("Negative : " + negativeCount);
		System.out.println("Zero : " + zeroCount);
		sc.close();
	}
}
