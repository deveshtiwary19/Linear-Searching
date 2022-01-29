package com.company;


public class Main {

    public static void main(String[] args) {

        int[] arr= {12,23,33,34,48};
        String string="Devesh";

        //Searching an Item in array
        int search= searchItem(arr, 34);
        if (search == Integer.MIN_VALUE) {
            System.out.print("Not found");
        }
        else{
            System.out.println(search);
        }
        ////////////////////////////

        //Searching for a charcter in string
        boolean present= searchInString(string, 'e');
        System.out.println(String.valueOf(present));
        //////////////////////////////////////////

        //Searching an Item in array in a given range
        int searchInRange= searchIteminRange(arr, 23, 1, 3);
        if (searchInRange == Integer.MIN_VALUE) {
            System.out.print("Not found");
        }
        else{
            System.out.println(searchInRange);
        }
        ////////////////////////////


    }

    //Following is the method, to search an item in an Array in a given Range
    static int searchIteminRange(int[] arr, int target, int startIndex, int endIndex){
        if (startIndex<0 || endIndex>arr.length || arr.length==0){
            return Integer.MIN_VALUE;
        }
        else {

            //Now the array is  not null
            for (int i=startIndex; i<endIndex;i++){

                if(arr[i]==target) {
                    return target;
                }
            }
            return Integer.MIN_VALUE;
        }

    }

    //Following is the method, to search a char in string
    static  boolean searchInString(String string, char target){

        for (int i=0; i<string.length();i++){
            if( string.charAt(i)== target){
                return true;
            }
        }
        return false;

    }




    //Following is the method, to search an item in an Array
    static int searchItem(int[] arr, int target){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        else
        {
            //Now the array is  not null
            for (int i=0; i<arr.length;i++){

                if(arr[i]==target) {
                    return target;
                }
            }
            return Integer.MIN_VALUE;
        }
    }



}

