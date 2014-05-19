package org.j2eedev.recursion;

public class ReversingArrayUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input    : arr={0,1,2,3,4,5,6,7,8}
		//output   : arr={8,7,6,5,4,3,2,1,0}
		int[] arr={0,1,2,3,4,5,6,7,8};
		int length=arr.length;
		int[] revArray=reverseArray(arr,0,length-1);
		//loop through array for display.
		for(int i:revArray)
			System.out.print(i+" ");

	}
	/**
	 * <p>Reversing array using Recursion
	 *   Example of Tail Recursion.
	 * </p>
	 *   if (i<j) then 
	 *      swap elements a[i],a[j]  //i holds starting index, j holds ending index of array.
	 *      reverse(a,i+1,j-1)
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static int[] reverseArray(int[] a,int i,int j){
		//Tail Recursion.
		if(i<j){
			//swap elements a[i],a[j]
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			reverseArray(a, i+1, j-1);
		}
		return a;
	}

}
