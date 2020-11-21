package com.jminded.recursion;

public class GCDofTwoNumbersUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGCD(54,24));

	}
	/**
     * <p>Java method to find GCD of two number using Euclid's Algorithm</p>
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }else{ //recursive case
        return findGCD(number2, number1%number2);
        }
    }
}
