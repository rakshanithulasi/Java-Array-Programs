package basic;

import java.util.Scanner;

public class CountPairsWithGivenSum 
{
	public static void countPairs(int [] arr, int target)
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println(arr[i] + " + " + arr[j] + " = " + target);
					count++;
				}
			}
		}
		System.out.println("Number of pairs : " + count);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		countPairs(arr, target);
		sc.close();
	}
}
