package com.jminded.recursion;

public class LinearSumUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an array 
		int[] arr={0,1,2,3,4,5,6};
		int length=arr.length;
		System.out.println(linearSum(arr,length));

	}
	/**
	 * <p>Linear Sum</p>
	 *  if n=1 then  //base case
	 *     return a[0];
	 *  else         //recursive case  
	 *     return linearSum(a[n-1])+a[n-1];   
	 * @param a
	 * @param n
	 * @return
	 */
	public static int linearSum(int[] a,int n){
		//n--array length
		//base case
		if(n==1){
			return a[0];
		}
		//recursive case
		else if(n>0){
			return linearSum(a,n-1)+a[n-1];
		}else{
			return -1;
		}
	}
	

}
