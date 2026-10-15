package basic;

import java.util.Scanner;

public class CountOccurrencesOfElement 
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
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
