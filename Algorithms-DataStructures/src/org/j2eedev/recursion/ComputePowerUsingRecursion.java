package org.j2eedev.recursion;

public class ComputePowerUsingRecursion {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(computePower(2,5));
		System.out.println(computePower(2,-5));
		System.out.println(computePower(-2,5));
		System.out.println(computePower(-2,-5));

	}
	/**
	 * <p>Compute power</p>
	 * 
	 *  p(x,n)  =  1              if(x=0)
	 *          =  x*p(x,n-1)     if(n>0)
	 *          =  (1/x)*p(x,n+1) if(n<0)  
	 * @param x
	 * @param n
	 * @return
	 */
	public static double computePower(double x, double n){
		//base case
		if(n==0){
			return 1;
		}else if(n>0){   //recursive condition for postive power
			return x*computePower(x, n-1);
		}else if(n<0){  //recursive condition for negative power
			return (1/x)*computePower(x, n+1);
		}else{ 
			return -1;
		}
	}

}
