package basic;

import java.util.Scanner;

public class CopyOneArrayIntoAnother 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		int [] copy = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			copy[i] = arr[i];
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(copy[i] + " ");
		}
		sc.close();
	}
}
