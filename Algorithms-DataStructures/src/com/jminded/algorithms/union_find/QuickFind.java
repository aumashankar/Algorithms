package com.jminded.algorithms.union_find;

public class QuickFind {
    private int[] id;
    /**
     * Initializing the array 
     * @param n
     */
    public QuickFind(int n){
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }
    /**
     * Check whether p,q belong same equivalence classes, i.e whether p and q are connected.
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    /**
     * Quick Find
     * Time Complexity  :: O(n) if there are m unions, then O(mn)
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int id_1 = id[p];
        int id_2 = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id_1) 
            	id[i] = id_2; 
        }
    }
    /**
     * Find
     * Time Complexity  :: O(1)
     * @param p
     * @return equivalance id of set that p is being connected to.
     * 
     */
    public int find(int p){
    	return id[p];
    }
    
    public static void main(String[] args) {
        QuickFind q = new QuickFind(10);
        q.union(3, 8);
        q.union(5, 2);
        q.union(2, 3);
        q.union(9, 1);
        q.union(7, 4);
        q.union(3, 9);
        for (int i = 0; i < 10; i++) 
            System.out.print(q.id[i] + " ");
        
        System.out.println();
        System.out.println("Find Operation for 5-->"+q.find(5));
    }
}
