package com.company;

//Following is the Leet Code problem 1 for Linear Searching
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LeetCodeLinearSearchingP1 {
    public static void main(String[] args) {

        int[] arr= {12,345,2,6,7896};

        System.out.println(findNumbers(arr));

    }
    //Following is the method, template provided according to leet code
   static int findNumbers(int[] arr) {

        int flag=0;
    for (int i=0; i<arr.length;i++){
        if (isEven(numberOfDigits(arr[i]))){
            flag++;
        }
    }
    return flag;
    }


    //Following is the method, to check if the following number is even or not
    static boolean isEven(int n){
    if (n==0){
        return false;
    }else {
        if (n%2==0){
            return true;
        }
    }
    return false;
    }


    //Following is the function, that takes out number of digits
    static int numberOfDigits(int n){
        //Converting number to positive if provided integer is negative
        if (n<0){
            n=n*-1;
        }
        //Returning 1, if the number is 0
        if (n==0)return 1;

//        //Method 1 (Old one)

//        int count=0;
//        while (n>0){
//            count++;
//            n=n/10;
//        }
//        return  count;

        //Method 2 (New One)

        return (int)(Math.log10(n)+1);
    }
}
