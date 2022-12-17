package com.yahoooo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two indices between 1 and 5 you want to swap");
        int index1 = sc.nextInt() - 1 ;
        int index2 = sc.nextInt() - 1 ;

        int[] arr = {1, 2, 3, 4, 5};
        try {swap(arr, index1, index2);}
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Wrong input \n" + e.getMessage());
        }

    }
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
