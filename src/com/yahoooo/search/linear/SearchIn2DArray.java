package com.yahoooo.search.linear;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray
{
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5},
                {2, 4, 6},
                {7, 9, 11}
        };
        //int[] ans = search(arr, 3);
        System.out.println(Arrays.toString(search(arr, 5)));
    }

    static int[] search(int[][]arr, int target)
    {
        if(arr.length !=0)
        {
            for(int row = 0; row<arr.length; row++)
            {
                for(int col = 0; col<arr[row].length; col++)
                {
                    if(arr[row][col] == target)
                        return new int[]{row, col};
                }
            }
        }
        return new int[]{Integer.MAX_VALUE};
    }

}
