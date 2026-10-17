package basic;

import java.util.Scanner;

public class ThirdLargestDistinctElementInArray 
{
	public static void thirdlargestdistinct(int [] arr)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == max1 || arr[i] == max2 || arr[i] == max3)
			{
				continue;
			}
			if(arr[i] > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2 && arr[i] != max1)
			{
				max3 = max2;
				max2 = arr[i];
			}
			else if(arr[i] > max3)
			{
				max3 = arr[i];
			}
		}
		if(max3 == Integer.MIN_VALUE)
		{
			System.out.println("Third largest distinct element does not exist");
		}
		else
		{
			System.out.println("Third largest distinct element : " + max3);
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
		thirdlargestdistinct(arr);
		sc.close();
	}

}
