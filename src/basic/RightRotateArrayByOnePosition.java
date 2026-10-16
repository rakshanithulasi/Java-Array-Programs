package basic;

import java.util.Scanner;

public class RightRotateArrayByOnePosition 
{
	public static void rightrotate(int [] arr)
	{
		int temp = arr[arr.length - 1];
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
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
		rightrotate(arr);
		sc.close();
	}
}
