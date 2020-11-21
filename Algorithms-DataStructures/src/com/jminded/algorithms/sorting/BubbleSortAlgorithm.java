package com.jminded.algorithms.sorting;

public class BubbleSortAlgorithm {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,1,4,0,7,9,2};
		System.out.println("Normal BubbleSort");
		long time1=System.nanoTime();
		bubbleSort(arr);
		long time2=System.nanoTime();
		System.out.println("Time taken for Normal Bubble sort "+(time2-time1));
		int[] array={3,1,4,0,7,9,2};
		System.out.println();
		System.out.println("Bubble Sort Improved");
		time1=0;
		time2=0;
		time1=System.nanoTime();
		bubbleSortImproved(array);
		time2=System.nanoTime();
		System.out.println("Time taken for Improved Bubble sort "+(time2-time1));
	}
	/**
	 * <p>Bubble Sort implimentation</p>
	 * 
	 * for each i=0 to n
	 *   for j=0; j<(n-i-1)
	 *     if a[j]>a[j+1]
	 *      swap elements
	 *      
	 * @param a
	 * For the array {3,1,4,0,7,9,2} sorting sequences as below
	 * 	1 3 0 4 7 2 9 
		1 0 3 4 2 7 9 
		0 1 3 2 4 7 9 
		0 1 2 3 4 7 9 
		0 1 2 3 4 7 9 
		0 1 2 3 4 7 9 
		0 1 2 3 4 7 9
	 *  Time Complexity=O(n^2)  	
	 */
	public static void bubbleSort(int[] a){
	   System.out.println("Array before sorting");
	   for(int i:a)
	   System.out.print(i+" ");
	   System.out.println();
	   System.out.println("Sorting sequences after each iteration");
       int n=a.length;
       for(int i=0;i<n;i++){
    	   for(int j=0;j<(n-i-1);j++){
    		   if(a[j]>a[j+1]){
    			   //swap elements, greatest one bubbles out.
    			   int temp=a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    	   }
    	   for(int k:a)
        	   System.out.print(k+" ");
		   System.out.println();
       }
       System.out.println("Array after sorting");
       for(int i:a)
    	   System.out.print(i+" ");
	}
	/**
	 * <p>Bubble Sort implimentation, improved with extra swapped variable</p>
	 *  For the array {3,1,4,0,7,9,2} sorting sequences as below
	 * 	1 3 0 4 7 2 9 
		1 0 3 4 2 7 9 
		0 1 3 2 4 7 9 
		0 1 2 3 4 7 9 
	 * @param a
	 * Time Complexity=O(n^2)
	 */
	public static void bubbleSortImproved(int[] a){
		   System.out.println("Array before sorting");
		   for(int i:a)
		   System.out.print(i+" ");
		   System.out.println();
		   System.out.println("Sorting sequences after each iteration");
	       int n=a.length;
	       boolean swapped=true;
	       for(int i=0;i<n&&swapped;i++){
	    	   swapped=false;
	    	   for(int j=0;j<(n-i-1);j++){
	    		   if(a[j]>a[j+1]){
	    			   //swap elements, greatest one bubbles out.
	    			   int temp=a[j];
	    			   a[j]=a[j+1];
	    			   a[j+1]=temp;
	    			   swapped=true;
	    		   }
	    	   }
	    	   for(int k:a)
	        	   System.out.print(k+" ");
			   System.out.println();
	       }
	       System.out.println("Array after sorting");
	       for(int i:a)
	    	   System.out.print(i+" ");
		}

}
