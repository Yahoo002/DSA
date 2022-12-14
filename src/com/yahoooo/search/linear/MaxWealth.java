package com.yahoooo.search.linear;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth
{
    public static void main(String[] args)
    {
        int[][]accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][]accounts)
    {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++)
        {
            int rowSum = 0;
            for(int col = 0; col < accounts[row].length; col++)
            {
                rowSum = rowSum + accounts[row][col];
            }
            if(rowSum > max)
                max = rowSum;
        }
        return max;
    }
}
