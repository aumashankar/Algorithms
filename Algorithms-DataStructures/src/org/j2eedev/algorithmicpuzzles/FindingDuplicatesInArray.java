package org.j2eedev.algorithmicpuzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindingDuplicatesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={0,3,2,2,1,5,6,7,9};
		int[] arr2={0,3,2,1,5,6,7,9};
		/**
		 * Finding duplicates Brute Force technique
		 */
		System.out.println(checkDuplicatesBruteForce(arr1));
		System.out.println(checkDuplicatesBruteForce(arr2));
		/**
		 * Finding duplicates Brute Force improved technique.
		 */
		System.out.println(checkDuplicatesBruteForce2(arr1));
		System.out.println(checkDuplicatesBruteForce2(arr2));
		
		/**
		 * Checking duplicates in the array by sorting
		 * Sorting in place takes O(nlogn) time and after sorting, for checking duplicates takesO(n)
		 * Time Complexity  ::O(nlogn)
		 * Space Complexity ::O(1)
		 */
		//we are directly taking sorting array.
		int[] arr3={0,1,2,2,5,6,7,9};
		System.out.println(checkDuplicatesWithArraySorted(arr3));
		
		/**
		 * Checking duplicates in the array using Hashing
		 * Hashing takes O(1) constant time for searching element in hashtable in avg case and in worst case it takes O(n) time
		 * For looping through n elements and adding to HashMap takes O(n) time
		 * Time Complexity  ::O(n)
		 * Space Complexity ::O(n)  As we are storing elements into HashMap, which is an extra space.
		 */
		int[] arr4={0,3,2,2,1,5,6,7,9};
		System.out.println(checkDuplicatesWithHashMap(arr4));
		/**
		 * Checking duplicates in the array by placing negative values
		 * Array elements should be in the range 0 to n-1
		 * This solution does not work if the given array is read only and all the elements should be +ve
		 * Time Complexity  :: O(n)
		 * Space Complexity :: O(1)
		 */
		int[] arr5={0,1,2,2,4,5,6};
		System.out.println(checkDuplicatesWithMathAbs(arr5));
		
		/**
		 * Check duplicates using list and set
		 */
		System.out.println(checkDuplicateUsingSet(arr5));
		
		/**
		 * Check duplicates using set add
		 */
		System.out.println(checkDuplicateUsingAdd(arr5));
		
	}
	
	/**
	 * <p>check for array duplicates</p>
	 * Time Complexity   :: O(n^2)
	 * Space Complexity  :: O(1)
	 * @param a
	 * @return
	 */
	public static int checkDuplicatesBruteForce(int[] a){
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				count++;
				if(a[i]==a[j]&&i!=j){
					System.out.println("No.of comparisons BruteForce"+count);
					return a[i];
				}
			}
		}
		System.out.println("No.of comparisons BruteForce"+count);
		return -1;
	}
	/**
	 * <p>check for array duplicates</p>
	 * Time Complexity   :: O(n^2)
	 * Space Complexity  :: O(1)
	 * @param a
	 * @return
	 */
	public static int checkDuplicatesBruteForce2(int[] a){
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				count++;
				if(a[i]==a[j]&&i!=j){
					System.out.println("No.of comparisons BruteForce2"+count);
					return a[i];
				}
			}
		}
		System.out.println("No.of comparisons BruteForce2"+count);
		return -1;
	}
	/**
	 * <p>Checking duplicates in an array by sorting</p>
	 * Time Complexity   ::O(nlogn)
	 * Space Complexity  ::O(1)
	 * @param a
	 * @return
	 */
	public static int checkDuplicatesWithArraySorted(int[] a){
		int n=a.length;
		//Sort array in place O(nlogn)
		//for checking duplicate O(n)
		for(int i=0;i<n-1;i++){
			if(a[i]==a[i+1])
				return a[i];
		}
		return -1;
	}
	/**
	 * <p>Check for duplicates in the array with Hashing</p>
	 * Time Complexity  ::O(n) 
	 * Space Complexity ::O(n) 
	 * @param a
	 * @return
	 */
	public static int checkDuplicatesWithHashMap(int[] a){
		int n=a.length;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			if(map.containsKey(a[i])){
				int value=(int)((Integer)map.get(a[i]));
				value=value+1;
				map.put(a[i],value);
				return a[i];
			}else{
				map.put(a[i],0);
			}
		}
		return -1;
	}
	/**
	 * <p>Check Duplicates in the array using Math abs</p>
	 * Time Complexity   ::O(n)
	 * Space Complexity  ::O(1)
	 * @param a
	 * @return
	 */
	public static int checkDuplicatesWithMathAbs(int[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			if(a[Math.abs(a[i])]<0)
				return a[i];
			else
				a[a[i]]=-a[a[i]];
		}
		return -1;
	}
	/**
	 * <p>Check duplicates by making list and set comparing length of lists</p>
	 * @param a
	 * @return
	 */
	public static boolean checkDuplicateUsingSet(int[] a){
        List inputList = Arrays.asList(a);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()){
            return true;
        }
        return false;
    }
	/**
	 * <p>Check duplicates by adding to Set (Hashing technique)</p>
	 * @param a
	 * @return
	 */
	  public static boolean checkDuplicateUsingAdd(int[] a) {
	        Set tempSet = new HashSet();
	        for (int i :a) {
	            if (!tempSet.add(i)) {
	                return true;
	            }
	        }
	        return false;
	    }

}
