package org.j2eedev.algorithms.search;

public class SortedArrayLinearSearch {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,4,5,6,7};
		int searchIndex=linearSearch(arr,3);
		System.out.println("Element at search index "+searchIndex);
        searchIndex=linearSearch(arr, 7);
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
			/*As it is sorted array, no need to search for element after 
			crossing the array number greater than the number we want to search.*/
			else if(a[i]>number) 
				return -1;
		}
		return -1;
	}

}
