package basic;

import java.util.Scanner;

public class SecondSmallestElementInArray 
{
	public static void secondsmallest(int [] arr)
	{
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i] < min2 && arr[i] != min1)
			{
				min2 = arr[i];
			}
		}
		System.out.println("Second Smallest Value is : " + min2);
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
		secondsmallest(arr);
		sc.close();
	}
}
