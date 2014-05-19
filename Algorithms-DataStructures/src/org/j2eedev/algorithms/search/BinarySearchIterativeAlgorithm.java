package org.j2eedev.algorithms.search;

public class BinarySearchIterativeAlgorithm {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,4,5,6,7};
		int searchIndex=binarySearch(arr,3);
		System.out.println("Element at search index "+searchIndex);
        searchIndex=binarySearch(arr, 7);
        System.out.println("Element at search index "+searchIndex);

	}
	/**
	 * <p>Binary Search Algorithm</p>
	 * @param a
	 * @param number
	 * @return
	 * Time Complexity ::  O(logn)
	 * Space Complexity::  O(1)
	 */
	public static int binarySearch(int[] a,int number){
		int n=a.length;
		int low=0;
		int high=n-1;
		while(low<=high){
			int mid=low+(high-low)/2; //To avoid overflow
			if(a[mid]==number)
				return mid;
			else if(a[mid]<number)
				 low=mid+1;
			else
				 high=mid-1;
		}
		return -1;
	}
}
