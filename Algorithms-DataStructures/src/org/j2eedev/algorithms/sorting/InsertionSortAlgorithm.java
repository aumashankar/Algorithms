package org.j2eedev.algorithms.sorting;

public class InsertionSortAlgorithm {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,2,1,4,3,5,0,9};
		System.out.println("Array before sorting");
	    for(int k:arr)
    		System.out.print(k+" ");
		System.out.println();
		System.out.println("Insertion Sort Sequences");
		insertionSort(arr);
		System.out.println("Array elements after sorting");
		for(int k:arr)
    		System.out.print(k+" ");
		int[] arr2={7,2,1,4,3,5,0,9};
		System.out.println("Array before sorting");
	    for(int k:arr2)
    		System.out.print(k+" ");
		System.out.println();
		System.out.println("Insertion Sort Sequences");
		insertionSortVariant(arr2);
		System.out.println("Array elements after sorting");
		for(int k:arr2)
    		System.out.print(k+" ");

	}
	/**
	 * <p>Insertion Sort</p>
	 * Time Complexity :: O(n^2)
	 * @param a
	 */
	public static void insertionSort(int[] a){
		int n=a.length;
        for (int i = 0; i <n; i++) {
            for (int j = i; j > 0; j--) {	
                if (a[j]<a[j-1]){ 
                  //Exchange elements	
                  int temp=a[j];
                  a[j]=a[j-1];
                  a[j-1]=temp;
                }
                else
                	break;
            }
            for(int k:a)
        		System.out.print(k+" ");
            System.out.println();
        }
	}
	/**
	 * Time Complexity :: O(n^2)
	 * @param a
	 */
	public static void insertionSortVariant(int[] a){
		int n=a.length;
		int v=0;
        for (int i = 1; i <n; i++) {
            v=a[i];
            int j=i;
            while(j>0&&a[j-1]>v){
            	//shift the elements to the right, to create room for smaller element.
            	a[j]=a[j-1];
            	j--;
            }
            //insert v element in created slot
            a[j]=v;
            for(int k:a)
        		System.out.print(k+" ");
            System.out.println();
        }
	}

}
