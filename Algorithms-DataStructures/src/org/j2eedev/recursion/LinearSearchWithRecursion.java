package org.j2eedev.recursion;

public class LinearSearchWithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,5,3,2,0,8,6};
		int searchIndex=linearSearchRecursion(arr,8,0,arr.length-1);
		
		if(searchIndex==-1)
			System.out.println("Element you are searching for is not found!");
		else
			System.out.println("Element at an Index position "+searchIndex);

	}
	/**
	 * <p>Recursive solution for Linear Search</p>
	 * @param keys
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	public static int linearSearchRecursion( int[] keys, int key, int low, int high ) {
	 if (low > high) {
	   // There are no more keys left.
	   return -1;
	 } else if (keys[ low ] != key) {
	   // Search for key in remaining keys.
	   return linearSearchRecursion( keys, key, low + 1, high );
	 } else {
	   // We’ve located key.
	   return low;
	 }
	}
}
