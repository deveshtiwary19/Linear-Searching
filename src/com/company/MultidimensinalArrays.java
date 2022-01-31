package com.company;

public class MultidimensinalArrays {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        //Following is the method, that finds the largest number in 2D array
        System.out.println(searchGreatest(arr));
        /////////////////////////////////////////////////////////////////////


        //Following is the method, that finds the smallest number in 2D array
        System.out.println(searchSmallest(arr));
        /////////////////////////////////////////////////////////////////////



    }

    //Following is the method, that will search for the smallest integer in 2D array
    static int searchSmallest(int[][] arr){

        //Checking for null array
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }


        //Creating a flag and setting it to maxm value and keep updating it while iterating
        int flag=Integer.MAX_VALUE;
        //Following loop iterates throgh the columns
        for (int i=0; i<arr.length;i++){
            //Following row iterates through the rows
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j]<flag){
                    flag=arr[i][j];
                }
            }


        }
        return flag;
    }

    //Following is the method, that will search for the largest integer in 2D array
    static int searchGreatest(int[][] arr){

        //Checking for null array
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }


        //Creating a flag and setting it to maxm value and keep updating it while iterating
        int flag=Integer.MIN_VALUE;
        //Following loop iterates throgh the columns
        for (int i=0; i<arr.length;i++){
            //Following row iterates through the rows
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j]>flag){
                    flag=arr[i][j];
                }
            }


        }
        return flag;
    }
}
