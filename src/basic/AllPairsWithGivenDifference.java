package basic;

import java.util.Scanner;

public class AllPairsWithGivenDifference 
{
	public static void allPairsDifference(int [] arr, int target)
	{
		int count=0;
		 System.out.println("Pairs with difference " + target + ":");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(Math.abs(arr[i] - arr[j]) == target)
				{
					System.out.println(arr[i] + " and " + arr[j] + " = " + target);
					count++;
				}
			}
		}
		System.out.println("Total Pairs : " + count);
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
		allPairsDifference(arr, target);
		sc.close();
	}
}
