package com.mphasis;

import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearch {
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int[] arr = {7, 65, 89, 37, 1, 10, 171, 242, 74, 89};
		    Arrays.sort(arr);
		    System.out.println("Sorted array- " + Arrays.toString(arr));
		    System.out.println("Enter value to search: ");
		    int searchElement = sc.nextInt();
		    int index = exponentialSearch(arr, searchElement);
		    if(index != -1){
		      System.out.println("Searched item " + arr[index] + " found at index "+index);
		    }else{
		      System.out.println("Searched item " + searchElement + " not found in the array");
		    }
		    sc.close();
		  }
		    
		  private static int exponentialSearch(int[] arr, int searchElement){
		    int bound = 1;
		    while (bound < arr.length && arr[bound] < searchElement) {
		      bound *= 2;
		    }
		    return binarySearch(arr, bound/2, Integer.min(bound + 1, arr.length), searchElement);
		  }
		  private static int binarySearch(int[] arr, int start, int end, int searchElement){
		    if(start > end){
		      return -1;
		    }        
		    int middle = (start+end)/2;
		    if(searchElement == arr[middle]){
		      return middle;
		    }
		    if(searchElement < arr[middle]){
		      return binarySearch(arr, start, middle-1, searchElement);
		    }else{
		      return binarySearch(arr, middle+1, end, searchElement);        
		    }
		  }
}