
import java.util.*;
public class set2 {
    public static void main(String args[]){
       // set2.q1();
       // set2.q2();
       //set2.q5();
       //set2.q9();
       // set2.q6();

    }

////////////////////////////////////////////////////////////////////////////////////////////////////

// Given an integer array nums, find the
// subarray with the largest sum, and return its sum.
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static void q1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////

// Given an integer array arr[] of size n, the task is to find the count inversions of the given array.
// Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
// Input: arr[] = {7, 2, 6, 3}
// Output: 4
// Explanation: Given array has 4 inversions: (7, 2), (7, 6), (7, 3), (6, 3)


    public static void q2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
            }
           System.out.println();

            System.out.println("NO. of inversions: " + set2.inversion(arr,n));

    }
    public static int inversion(int arr[],int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }





////////////////////////////////////////////////////////////////////////////////////////////////////
// 3)Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Solve it without sorting.
// Example:
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5



public static void q3(){

}

//////////////////////////////////////////////////////////////////////////////////////////////////////

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
// removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = “A man, a plan, a canal: Panama”
// Output: true
// Explanation: “amanaplanacanalpanama” is a palindrome.
// Example 2:
// Input: s = “race a car”;
// Output: false



public static void q4(){

}

/////////////////////////////////////////////////////////////////////////////////////////////////////

// Given an array arr[] of size n, return an equilibrium index (if any) or -1 if no equilibrium index
// exists. The equilibrium index of an array is an index such that the sum of elements at lower
// indexes equals the sum of elements at higher indexes.
// Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
// Examples:
// Input: arr[] = {-7, 1, 5, 2, -4, 3, 0}
// Output: 4
// Explanation: In 1-based indexing, 4 is an equilibrium index, because:
// arr[1] + arr[2] + arr[3] = arr[5] + arr[6] + arr[7]
// Input: arr[] = {1, 2, 3}
// Output: -1
// Explanation: There is no equilibrium index in the array.


public static void q5(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements of array: ");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
   equilibrium(arr, n);
}
public static void equilibrium(int arr[],int n){
     int count = -1;
    for(int i=0;i<n;i++){
        int ls =0;
        for(int j=0;j<i;j++){
            ls = ls + arr[j];
        }
        int rs = 0;
        for(int j=i+1;j<n;j++){
            rs = rs + arr[j];
        }
        if(ls == rs){
            count = i+1;
            break;
             }    
}
if(count == -1){
    System.out.println("no equilibriums found");
}
else{
    System.out.println("equilibruids found at index : " + count);
}
}
// /////////////////////////////////////////////////////////////////////////////////////////////////////

// Given a sorted array A (sorted in ascending order), having N integers, find if there exists any
// pair of elements (A[i], A[j]) such that their sum is equal to X.
// a)Using Naive Approach
// b)Using Two Pointer Technique
// Input: A = [1, 2, 4, 5, 7, 11]
// N = 6
// X = 9
// Expected Output: Yes
// (Explanation: The pair (2, 7) sums to 9.)

public static void q6(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n= sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array: ");
    for(int i = 0 ;i<n ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("enter value of sum: ");
    int x = sc.nextInt();
    
    pair(arr,n,x);
}
public static void pair(int arr[],int n,int x){
    int flag =0;
    int a=0;
    int b=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i] + arr[j] == x){
                a= i+1;
                b= j+1;
                flag = 1;
                break;
            }
        }
    }
    if(flag == 1){
        System.out.println("yes pair found at indexes : " + a +  " and " + b);
    }
    else{
        System.out.println("no pair found");
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////

// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether 
// the two given strings are anagrams of each other or not. An anagram of a string is another string
//  that contains the same characters, only the order of characters can be different. 
//  For example, “act” and “tac” are anagrams of each other.

// Examples:

// Input: str1 = “listen”  str2 = “silent”
// Output: “Anagram”
// Explanation: All characters of “listen” and “silent” are the same.


// Input: str1 = “gram”  str2 = “arm”
// Output: “Not Anagram”


public static void q7(){

}

// ///////////////////////////////////////////////////////////////////////////////////////////////////

// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’
// consecutive elements in the array(Using Sliding Window Technique)
// Input : arr[] = {100, 200, 300, 400}, k = 2
// Output : 700
// Input : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
// Output : 39
// We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
// Input : arr[] = {2, 3}, k = 3
// Output : Invalid
// There is no subarray of size 3 as size of whole array is 2.

public static void q8(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array: ");
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("enter value of k: ");
    int k = sc.nextInt();

    maxSum(arr, n, k);
}

public static void maxSum(int arr[], int n, int k){
    int sum = 0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<k;j++){
            sum = ;
        }
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////


// You are given an array of prices where prices[i] is the price of a given stock on an ith day. You
// want to maximize your profit by choosing a single day to buy one stock and choosing a
// different day in the future to sell that stock. Return the maximum profit you can achieve from
// this transaction. If you cannot achieve any profit, return 0
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5

public static void q9(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array: ");
    for(int i=0;i<n;i++){
        arr[i] =  sc.nextInt();
    }
    maxProfit(arr,n);
}
public static void maxProfit(int arr[], int n){
    int max = 0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i] < arr[j]){
                if(max < (arr[j] - arr[i])){
                    max = arr[j] - arr[i];
                }
            }
        }
    }
    System.out.println("max profit : " + max);
}
/////////////////////////////////////////////////////////////////////////////////////////////////////

// Given an integer array, find the maximum length subarray having a given sum.(USE
// HASHMAP Concept)
// Input:nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }target = 8
// Output:{ -5, 5, 3, 5 }
// Subarrays with sum 8 are { -5, 5, 3, 5 },{ 3, 5 },{ 5, 3 }
// The longest subarray is { -5, 5, 3, 5 } having length 4.


public static void q10(){

}


}