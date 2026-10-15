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
		int even_count = 0;
		int odd_count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("Even Count : " + even_count);
		System.out.println("Odd Count : " + odd_count);
	}
}
