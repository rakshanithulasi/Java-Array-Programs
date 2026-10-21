package basic;

import java.util.Scanner;

public class LongestSubarrayWithGivenSum
{
    public static void findLongestSubarray(int[] arr, int target)
    {
        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                if (sum == target)
                {
                    int length = j - i + 1;
                    if (length > maxLength)
                    {
                        maxLength = length;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        if (maxLength == 0)
        {
            System.out.println("No subarray found with sum " + target);
        }
        else
        {
            System.out.println("Longest subarray with sum " + target + ":");
            for (int i = startIndex; i <= endIndex; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Length: " + maxLength);
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
        findLongestSubarray(arr, target);
        sc.close();
    }
}