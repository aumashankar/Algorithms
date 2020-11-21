package com.jminded.recursion;


public class FibonacciNumberUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci series --> 0,1,1,2,3,5,8,13. . . .
		//fibonacciNumber(0) represents 0th fibonacci number, fibonacciNumber(6) represents 5th fibonacci number with zero based index. i.e., 8
		System.out.println(fibonacciNumber(6));	
	}
	/**
	 * <p>Fibonacci Number using Recursion</p>
	 * fib(n)    = 0  if(n=0)
	 *           = 1  if(n=1)
	 *           = fib(n-1)+fib(n-2) 
	 * @param n
	 * @return
	 */
	public static int fibonacciNumber(int n){
		//fibonacci series --> 0,1,1,2,3,5,8,13. . . .
		//base cases
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{   //recursive case
			return fibonacciNumber(n-1)+fibonacciNumber(n-2);
		}
	}

}
