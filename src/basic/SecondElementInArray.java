package basic;

import java.util.Scanner;

public class SecondElementInArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Second Element is : " + arr[1]);
		sc.close();
	}
}
