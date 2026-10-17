package basic;

import java.util.Scanner;

public class FindAllMissingNumbersInArray 
{
	public static void allmissingelements(int [] arr, int n)
	{
		System.out.print("Missing numbers: ");
		for(int num=1; num<=n; num++)
		{
			boolean found = false;
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] == num)
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = sc.nextInt();
		int [] arr = new int[size-1];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		allmissingelements(arr, n);
		sc.close();
	}
}
