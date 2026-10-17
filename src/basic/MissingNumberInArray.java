package basic;

import java.util.Scanner;

public class MissingNumberInArray 
{
	public static void missingvalues(int [] arr, int size)
	{
		int totalSum = size * (size + 1)/2;
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		int missingNumber = totalSum - sum;
		System.out.println("Missing Number : " + missingNumber);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size-1];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		missingvalues(arr, size);
		sc.close();
	}
}
