package basic;

import java.util.Scanner;

public class MoveAllZerosToEnd 
{
	public static void movezeros(int [] arr)
	{
		int index = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != 0)
			{ 
				arr[index] = arr[i];
				index++;
			}
		}
		while(index < arr.length)
		{
			arr[index] = 0;
			index++;
		}
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
		movezeros(arr);
		sc.close();
	}
}
