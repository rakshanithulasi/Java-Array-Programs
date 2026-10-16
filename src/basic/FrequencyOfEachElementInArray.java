package basic;

import java.util.Scanner;

public class FrequencyOfEachElementInArray 
{
	public static void frequencyeachvalue(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean alreadyCounted = false;
			for(int k=0; k<i; k++)
			{
				if(arr[i] == arr[k])
				{
					alreadyCounted = true;
					break;
				}
			}
			if(!alreadyCounted)
			{
				int count = 0;
				for(int j=0; j<arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
					}
				}
				System.out.println(arr[i] + " - " + count + " times");
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
		frequencyeachvalue(arr);
		sc.close();
	}
}
