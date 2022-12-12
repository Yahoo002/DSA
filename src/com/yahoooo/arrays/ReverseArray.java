package com.yahoooo.arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to reverse an array");
        System.out.println("Enter 5 numbers");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
