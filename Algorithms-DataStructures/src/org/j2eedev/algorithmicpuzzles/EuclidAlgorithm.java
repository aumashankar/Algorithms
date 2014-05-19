package org.j2eedev.algorithmicpuzzles;

public class EuclidAlgorithm {

	/**
	 * @author Umashankar
	 * @param args
	 * {@link http://j2eedev.org}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(gcd(16, 32));
          System.out.println(gcd(3, 66));
	}
	
	/**
	 * GCD of given two numbers
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p, int q){
		if(q==0)
			return p;
		int r=p%q;
		return gcd(q,r);
	}

}
