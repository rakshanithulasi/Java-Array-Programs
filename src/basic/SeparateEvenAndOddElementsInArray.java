package basic;

import java.util.Scanner;

public class SeparateEvenAndOddElementsInArray 
{
	public static void separateevenoddelements(int [] arr)
	{
		System.out.print("Even Elements : " );
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("\nOdd Elements : " );
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
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
		separateevenoddelements(arr);
		sc.close();
	}
}
