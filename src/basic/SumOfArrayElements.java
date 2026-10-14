package basic;

import java.util.Scanner;

public class SumOfArrayElements 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum = 0;
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
	}
}
