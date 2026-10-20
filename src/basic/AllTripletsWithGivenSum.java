package basic;

import java.util.Scanner;

public class AllTripletsWithGivenSum 
{
    public static void findTriplets(int[] arr, int target) 
    {
        int count = 0;
        System.out.println("Triplets with sum " + target + ":");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                for (int k = j + 1; k < arr.length; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == target) 
                    {
                        System.out.println(
                            arr[i] + " + " + arr[j] + " + " + arr[k]
                            + " = " + target);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Triplets: " + count);
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
        findTriplets(arr, target);
        sc.close();
    }
}
