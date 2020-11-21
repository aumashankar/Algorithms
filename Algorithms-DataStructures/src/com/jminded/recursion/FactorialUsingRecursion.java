package com.jminded.recursion;

public class FactorialUsingRecursion {

	/**
	 * <p>Factorial using Recursion</p>
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));
		System.out.println(factorial(0));
		System.out.println(factorial(-7));
 
	}
	/**
	 * Recursion :: A method calls to it self
	 * <p>Mathematical defintion of factorial</p>
	 * 
	 * 		f(n)= 1          if  n=0;
	 * 		f(n)= n*f(n-1)   if  n>0;
	 * 
	 * @param n
	 */
	public static int factorial(int n){
		//base case
		if(n==0)
			return 1;
		//recursive case
		else if(n>0)
			return n*factorial(n-1);
		//for negative numbers and non integers factorial is undefined.
		else
			return -1;
	}

}
