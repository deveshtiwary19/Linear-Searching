package com.company;

public class FloorCeiling {
    public static void main(String[] args) {
        int[] arr1= {2,4,6,8,10,12};
        int[] arr2= {12,10,8,6,4,2};
        //Printing the ceiling
        System.out.println(ceiling(arr2, 3)); //In Descending order
        System.out.println(ceiling(arr1, 3)); //In Ascending order
        //Printing the floor
        System.out.println(floor(arr2, 3)); //In Descending order
        System.out.println(floor(arr1, 3)); //In Ascending order
    }

    //Following is the function, that takes of ceiling from the Array
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        //Checking for ascending array
        if (arr[start]<arr[arr.length-1]){

            if(target>arr[arr.length-1]){
                //Target is larger than last element,hence can't find ceiling
                return -1;
            }


            while (start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                    return mid;
                }
                else if (arr[mid]>target){
                    end=mid-1;
                }
                else if (arr[mid]<target){
                    start=mid+1;
                }
            }
            return start;
        }
        //The array is Descending
        else{

            if(target>arr[start]){
                //Target is larger than fist element,hence can't find ceiling
                return -1;
            }

            while (start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                    return mid;
                }
                else if (arr[mid]<target){
                    end=mid-1;
                }
                else if (arr[mid]>target){
                    start=mid+1;
                }
            }
            return end;

        }



    }

    //Following is the function, that takes of floor from the Array
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        //Checking for ascending array
        if (arr[start]<arr[arr.length-1]){

            if(target<arr[start]){
                //Target is larger than last element,hence can't find ceiling
                return -1;
            }


            while (start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                    return mid;
                }
                else if (arr[mid]>target){
                    end=mid-1;
                }
                else if (arr[mid]<target){
                    start=mid+1;
                }
            }
            return end;
        }
        //The array is Descending
        else{

            if(target<arr[arr.length-1]){
                //Target is larger than fist element,hence can't find ceiling
                return -1;
            }

            while (start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                    return mid;
                }
                else if (arr[mid]<target){
                    end=mid-1;
                }
                else if (arr[mid]>target){
                    start=mid+1;
                }
            }
            return start;

        }



    }
}
