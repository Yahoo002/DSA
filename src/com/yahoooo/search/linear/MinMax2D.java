package com.yahoooo.search.linear;

import java.util.Arrays;

public class MinMax2D
{
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5},
                {2, 4, 6},
                {7, -8, 11}
        };

        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(maxForEach(arr));
    }

    static int min(int[][]arr)
    {
        int minValue = arr[0][0];
        if(arr.length !=0)
        {
            for(int row = 0; row<arr.length; row++)
            {
                for(int col = 0; col<arr[row].length; col++)
                {
                    if(arr[row][col] < minValue)
                        minValue = arr[row][col];
                }
            }
            return minValue;
        }
        return Integer.MAX_VALUE;
    }

    static int max(int[][]arr)
    {
        int maxValue = arr[0][0];
        if(arr.length !=0)
        {
            for(int row = 0; row<arr.length; row++)
            {
                for(int col = 0; col<arr[row].length; col++)
                {
                    if(arr[row][col] > maxValue)
                        maxValue = arr[row][col];
                }
            }
            return maxValue;
        }
        return Integer.MIN_VALUE;
    }

    //using for each loop
    static int maxForEach(int[][]arr)
    {
        int maxValue = arr[0][0];
        if(arr.length !=0)
        {
            for (int[] ints : arr) {
                for (int element : ints) {
                    if (element > maxValue)
                        maxValue = element;
                }
            }
            return maxValue;
        }
        return Integer.MIN_VALUE;
    }
}
