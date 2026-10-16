package basic;

import java.util.Scanner;

public class FindDuplicateElementsInArray 
{
	public static void duplicatevalues(int [] arr)
	{
		boolean duplicate = false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					duplicate = true;
				}
			}
		}
		if(duplicate)
		{
			System.out.println("Array contains duplicate elements");
		}
		else
		{
			System.out.println("Array does not contains duplicate elements");
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
		duplicatevalues(arr);
		sc.close();
	}
}
