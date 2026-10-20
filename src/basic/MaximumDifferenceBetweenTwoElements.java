package basic;

import java.util.Scanner;

public class MaximumDifferenceBetweenTwoElements 
{
    public static int maximumDifference(int[] arr) 
    {
        int minElement = arr[0];
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) 
        {
            int difference = arr[i] - minElement;
            if (difference > maxDifference) 
            {
                maxDifference = difference;
            }
            if (arr[i] < minElement) 
            {
                minElement = arr[i];
            }
        }
        return maxDifference;
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
        System.out.println("Maximum difference: " + maximumDifference(arr));
        sc.close();
    }
}