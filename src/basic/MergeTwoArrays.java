package basic;

import java.util.Scanner;

public class MergeTwoArrays 
{
	public static void mergearray(int [] a, int [] b)
	{
		int [] c = new int[a.length + b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length + i] = b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int [] a = new int[size1];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int size2 = sc.nextInt();
		int [] b = new int[size2];
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		mergearray(a,b);
		sc.close();
	}
}
