package basic;

import java.util.Scanner;

public class FirstRepeatingElementInArray 
{
	public static void firstrepeatingnumber(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean firstrepeating = false;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					firstrepeating = true;
					break;
				}
			}
			if(firstrepeating)
			{
				System.out.print("First repeating element: " + arr[i]);
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
		firstrepeatingnumber(arr);
		sc.close();
	}
}
