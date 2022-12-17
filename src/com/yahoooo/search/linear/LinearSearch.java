package com.yahoooo.search.linear;
/* Linear Search
* - Worse Case: O(n)
* - Best Case: O(1) */

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 30;
        System.out.println(lSearch(array, target));
    }

    static int lSearch(int[] arr, int target)
    {
        if(arr.length == 0)
            return Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
                if(arr[i] == target)
                    return i;
        }
        return Integer.MAX_VALUE;
    }
}
