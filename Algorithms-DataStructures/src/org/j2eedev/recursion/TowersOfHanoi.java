package org.j2eedev.recursion;

public class TowersOfHanoi {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void moveTowersOfHanoi(int noOfDisks, int startPole, int endPole) {
		if (noOfDisks == 0) {
			return;
		}
		int intermediatePole = 6 - startPole - endPole;
		moveTowersOfHanoi(noOfDisks - 1, startPole, intermediatePole);
		System.out.println("Move " + noOfDisks + " from " + startPole + " to "
				+ endPole);
		moveTowersOfHanoi(noOfDisks - 1, intermediatePole, endPole);
	}
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		moveTowersOfHanoi(5, 1, 3);
	}


}
