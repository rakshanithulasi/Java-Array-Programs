package basic;

import java.util.Scanner;

public class FirstNonRepeatingElementInArray 
{
	public static void firstnonrepeatingnumber(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean nonrepeated = true;
			for(int j=0; j<arr.length; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					nonrepeated = false;
					break;
				}
			}
			if(nonrepeated)
			{
				System.out.print("First non-repeated elements : " + arr[i]);
				break;
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
		firstnonrepeatingnumber(arr);
		sc.close();
	}
}
