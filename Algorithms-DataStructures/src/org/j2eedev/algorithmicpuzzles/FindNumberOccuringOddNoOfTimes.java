package org.j2eedev.algorithmicpuzzles;

public class FindNumberOccuringOddNoOfTimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Finding element that occurs odd no.of times, the remaining elements are repeating even no.of times.
		 * x^x=0  
		 */
		 
         int[] arr={1,2,3,2,3,1,3};
         int x=0;
         for(int i=0;i<arr.length;i++){
        	 x=x^arr[i];
        	  System.out.println(x);
         }
       
         System.out.println("Result"+x);
	}
	

}
