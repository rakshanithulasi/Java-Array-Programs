package basic;

import java.util.Scanner;

public class FindAllDuplicateElementsInArray 
{
	public static void allduplicateselements(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean duplicate = false;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					duplicate = true;
					break;
				}
			}
			boolean alreadyPrinted = false;
			for(int k=0; k<i; k++)
			{
				if(arr[i] == arr[k])
				{
					alreadyPrinted = true;
					break;
				}
			}
			if(duplicate && !alreadyPrinted)
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
		allduplicateselements(arr);
		sc.close();
	}
}
