package com.company;

//Following is the Leet Code problem 1 for Linear Searching
//https://leetcode.com/problems/richest-customer-wealth/

public class LeetCodeLinearSearchingP2 {
    public static void main(String[] args) {

        int[][] arr={
                {1,26,3}, //30
                {2,2,3,6,4}, //17
                {3,2,3}, //8
        };

        System.out.println(findRichest(arr));
    }

    static int findRichest(int[][] arr){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }

        int richestWealth=0; //Considering 0 at start
        for (int i=0; i<arr.length;i++){
            int sum=0; //Top store the sum of wealths while iterating inside the sub array
            for (int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }

            if (richestWealth<sum){
                richestWealth=sum;
            }
        }
        return richestWealth;

    }
}
