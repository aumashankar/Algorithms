package org.j2eedev.recursion;

public class BinarySearchWithRecursion {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To use binarySearch algorithm array should be sorted first.
		int[] arr={0,1,2,3,4,7,9};
		//searchIndex returned is zero based index. 
		int searchIndex=binarySearch(arr,4,0,arr.length);
		System.out.println("Search Index "+searchIndex);
	}
	/**
	 * <p>Binary Search using Recursion</p>
	 * @param keys
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	public static int binarySearch(int[] keys, int key, int low, int high) {
		if (low > high) {
			return -1;
		} else { // search in keys[ low..high ]
			int mid = (low + high) / 2;
			if (key < keys[mid]) {
				return binarySearch(keys, key, low, mid - 1);
			} else if (key > keys[mid]) {
				return binarySearch(keys, key, mid + 1, high);
			} else {
				return mid;
			}
		}
	}
}
