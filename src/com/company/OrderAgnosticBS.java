package com.company;

//Following is the class in which we will be performing the Order-Agnostic Binary Search
public class OrderAgnosticBS {

    public static void main(String[] args) {
        //Following are the two sorted arrays
        int[] arr1= {2,4,6,8,10,12}; //Ascending order
        int[] arr2= {12,10,8,6,4,2}; //Descending order

        System.out.println(search(arr2, 10));
    }

    //Following is the function to perform order agnostic Binary search
    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end]){
            //Following means that the array is Ascending Oder
            while (start<=end){
                int mid=end+((start-end)/2);

                if (arr[mid]==target){
                    return  mid;
                }
                else if (arr[mid]>target){
                    end=mid-1;
                }
                else if (arr[mid]<target){
                    start=mid+1;
                }
            }
        }
        else
        {
            //Following means that the array is in descending order
            while (start<=end){
                int mid=end+((start-end)/2);

                if (arr[mid]==target){
                    return  mid;
                }
                else if (arr[mid]<target){
                    end=mid-1;
                }
                else if (arr[mid]>target){
                    start=mid+1;
                }
            }
        }

        return Integer.MIN_VALUE;



    }





}
