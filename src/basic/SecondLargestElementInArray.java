package basic;

import java.util.Scanner;

public class SecondLargestElementInArray 
{
	public static void secondlargest(int [] arr)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2 && arr[i] != max1)
			{
				max2 = arr[i];
			}
		}
		System.out.println("Second Largest Value is : " + max2);	
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
		secondlargest(arr);
		sc.close();
	}
}
