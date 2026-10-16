package basic;

import java.util.Scanner;

public class LeftRotateArrayByOnePosition 
{
	public static void leftrotate(int [] arr)
	{
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = temp;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
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
		leftrotate(arr);
		sc.close();
	}
}
