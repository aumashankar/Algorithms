package org.j2eedev.algorithms.search;

public class UnSortedArrayLinearSearch {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,0,1,7,5,6,4};
		int searchIndex=linearSearch(arr,7);
		System.out.println("Element at search index "+searchIndex);
		searchIndex=linearSearch(arr,3);
		System.out.println("Element at search index "+searchIndex);

	}
	/**
	 * <p>UnSorted Array LinearSearch</p>
	 * @param a
	 * @param number
	 * @return
	 * Time Complexity ::  O(n) 
	 * Space Complexity :: O(1)
	 */
	public static int linearSearch(int[] a,int number){
		int n=a.length;
		for(int i=0;i<n;i++){
			if(a[i]==number)
				return i;
		}
		return -1;
	}

}
