package org.j2eedev.algorithms.search;

public class BinarySearchRecursiveAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,4,5,6,7};
		int searchIndex=binarySearch(arr,3,0,arr.length);
		System.out.println("Element at search index "+searchIndex);
        searchIndex=binarySearch(arr, 7,0,arr.length);
        System.out.println("Element at search index "+searchIndex);
	}
	/**
	 * <p>Binary Search Recursive Algorithm</p>
	 * @param a
	 * @param number
	 * @param low
	 * @param high
	 * @return search Index
	 * Recurrence relation :: T(n/2)+O(1)
	 * Time Complexity     :: O(logn)
	 * 
	 */
	public static int binarySearch(int[] a,int number,int low,int high){
		int mid=low+(high-low)/2;
		if(low>high){    
			return -1;
		}else{
		if(a[mid]==number)
			return mid;
		else if(a[mid]<number) //recursive case.
			return binarySearch(a, number, mid+1, high);
		else 
			return binarySearch(a, number, low, mid-1);
		}
		
	}

}
