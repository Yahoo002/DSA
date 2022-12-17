package com.yahoooo.search.linear;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class NoOfEvenDigits
{
    public static void main(String[] args)
    {
        int[] nums = {12,345,2,6,7896};
        System.out.println(countEvenLog(nums));

    }

    static int countEven(int[] nums)
    {
        int even = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int count = 0;
            if(nums[i] < 0)
                nums[i] = nums[i] * -1;

            if(nums[i] != 0)
            {
                while(nums[i] > 0)
                {
                    count++;
                    nums[i] = nums[i] / 10;
                }
                if(count % 2 == 0)
                    even++;
            }
        }
        return even;
    }

    static int countEvenLog(int[] nums)
    {
        int even = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int count = 0;
            if(nums[i] < 0)
                nums[i] = nums[i] * -1;

            if(nums[i] != 0)
            {
                count = (int)(Math.log10(nums[i])) + 1;
                if(count % 2 == 0)
                    even++;
            }
        }
        return even;
    }

    /*static int countString(int[] arr)
    {
        int count = 0;
        String arrS= Arrays.toString(arr);
        for(int i = 0; i<arrS.length(); i++)
        {
            if(arrS[i].lenght % 2 == 0)
                count++;
        }
        return count;

    }*/
}
