package com.jminded.algorithms.sorting;

public class SelectionSortAlgorithm {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,2,1,4,3,5,0,9};
		System.out.println("Array before sorting");
	    for(int k:arr)
    		System.out.print(k+" ");
		System.out.println();
		System.out.println("Selection Sorting Sequences");
		selectionSort(arr);
		System.out.println("Array elements after sorting");
		for(int k:arr)
    		System.out.print(k+" ");

	}
	/**
	 * <p>Selection Sort</p>
	 *  Minimum element bubbles out towards left
	 *  Time Complexity :: O(n^2)   
	 * @param a
	 */
	public static void selectionSort(int[] a){
		int n=a.length;
	        for (int i = 0; i <n; i++) {
	            int min = i;
	            for (int j = i+1; j < n; j++) {
	                if (a[j]<a[min]) //check for minimum element in the array
	                	 min = j;
	            }
	            //swap with minimum element.
	            int temp=a[i];
	            a[i]=a[min];
	            a[min]=temp;
	            for(int k:a)
	        		System.out.print(k+" ");
	            System.out.println();
	        }
	}

}
