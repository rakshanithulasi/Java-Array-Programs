package basic;

import java.util.Scanner;

public class RemoveDuplicateElementsFromArray 
{
	public static void removeduplicates(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean duplicate = false;
			for(int j=0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					duplicate = true;
					break;
				}
			}
			if(!duplicate)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		removeduplicates(arr);
		sc.close();
	}
}
