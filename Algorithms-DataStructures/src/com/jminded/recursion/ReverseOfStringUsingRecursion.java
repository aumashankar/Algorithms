package com.jminded.recursion;

public class ReverseOfStringUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="This is Recursion Tutorial";
		System.out.println(reverseString(s));
 	}
	/**
	 * <p> Reverse of a String using Recursion</p>
	 * @param str
	 * @return
	 */
	public static String reverseString(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }else{  //recursive case
        return reverseString(str.substring(1)) + str.charAt(0);
        }

    }

}
