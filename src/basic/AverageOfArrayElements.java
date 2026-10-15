package basic;

import java.util.Scanner;

public class AverageOfArrayElements 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		int sum = 0;
		double avg;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		avg = (double)sum / arr.length;
		System.out.println("Average of Array Elements : " + avg);
		sc.close();
	}
}
