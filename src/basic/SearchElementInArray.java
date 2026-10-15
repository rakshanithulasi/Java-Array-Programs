package basic;

import java.util.Scanner;

public class SearchElementInArray 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		boolean found = false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
		sc.close();
		
	}
}
