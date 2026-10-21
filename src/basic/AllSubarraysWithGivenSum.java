package basic;

import java.util.Scanner;

public class AllSubarraysWithGivenSum 
{
	public static void findSubarrays(int[] arr, int target)
    {
        System.out.println("Subarrays with sum " + target + ":");
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                if (sum == target)
                {
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        findSubarrays(arr, target);
        sc.close();
    }
}

