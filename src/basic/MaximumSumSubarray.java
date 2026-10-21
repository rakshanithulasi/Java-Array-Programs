package basic;

import java.util.Scanner;

public class MaximumSumSubarray
{
    public static void findMaximumSumSubarray(int[] arr)
    {
        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (currentSum + arr[i] < arr[i])
            {
                currentSum = arr[i];
                tempStart = i;
            }
            else
            {
                currentSum += arr[i];
            }
            if (currentSum > maxSum)
            {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum sum of subarray: " + maxSum);
        System.out.println("Subarray:");

        for (int i = start; i <= end; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0)
        {
            System.out.println("Array size must be greater than zero.");
            sc.close();
            return;
        }
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        findMaximumSumSubarray(arr);
        sc.close();
    }
}