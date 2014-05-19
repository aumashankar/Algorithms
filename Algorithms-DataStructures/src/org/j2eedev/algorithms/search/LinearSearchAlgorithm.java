package org.j2eedev.algorithms.search;

public class LinearSearchAlgorithm {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,5,3,2,0,8,6};
		int searchIndex=linearSearch(arr,0);
		
		if(searchIndex==-1)
			System.out.println("Element you are searching for is not found!");
		else
			System.out.println("Element at an Index position "+searchIndex);
		
		int recursiveIndex=linearSearchWithRecursion(arr,0,0,arr.length-1);
		
		if(recursiveIndex==-1)
			System.out.println("Element you are searching for is not found!");
		else
			System.out.println("Element at an Index position "+recursiveIndex);

	}
	/**<p>Finding an element through linear search --BruteForce method</p>
	 * @param a
	 * @param number
	 * @return searchIndex
	 * Time Complexity :
	 * Best case  : O(1)
	 * Worst case : O(n)
	 */
	public static int linearSearch(int[] a,int number){
		//length of the array
		int n=a.length;
		//Bruteforce method :: loop through n numbers if element found return the index, else return -1
		for(int i=0;i<n;i++){
			if(a[i]==number){
				return i;
			}
		}
        return -1;		
	}
	/**
	 * <p>Recursive solution for Linear Search</p>
	 * @param keys
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	public static int linearSearchWithRecursion( int[] keys, int key, int low, int high ) {
	 if (low > high) {
	   // There are no more keys left.
	   return -1;
	 } else if (keys[ low ] != key) {
	   // Search for key in remaining keys.
	   return linearSearchWithRecursion( keys, key, low + 1, high );
	 } else {
	   // We’ve located key.
	   return low;
	 }
	}

}
