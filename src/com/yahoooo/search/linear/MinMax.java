package com.yahoooo.search.linear;

public class MinMax
{
    public static void main(String[] args)
    {
        int[] arr = {9, 5, -8, 4, -8, 5, 0};
        System.out.println("Min value "+min(arr));
        System.out.println("Max value "+max(arr));
    }

    static int min(int[] arr)
    {
        if(arr.length != 0)
        {
            int ans = arr[0];
            int index = 0;
            for (int i = 1; i < arr.length; i++)
            {
                if(arr[i] < ans)
                {
                    ans = arr[i];
                    index = i;
                }
            }
            /*System.out.println(index);*/
            return ans;
        }
        return Integer.MAX_VALUE;
    }

    static int max(int[] arr)
    {
        if(arr.length != 0)
        {
            int ans = arr[0];
            int index = 0;
            for (int i = 1; i < arr.length; i++)
            {
                if(arr[i] > ans)
                {
                    ans = arr[i];
                    index = i;
                }
            }
            /*System.out.println(index);*/
            return ans;
        }
        return Integer.MIN_VALUE;
    }
}
