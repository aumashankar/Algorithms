package org.j2eedev.algorithms.union_find;

public class QuickUnion{
    private int[] id;
    /**
     * Initializing the array.
     * @param n
     */
    public QuickUnion(int n){
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }
    /**
     * Searching for parent, until we reach root.
     * @param p
     * @return
     */
    public int root(int p) {
        while (id[p] != p) p = id[p];
        return p;
    }
    /**
     * Check if p and q have same root.
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    /**
     * changing root of p pointing to root of q.
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        id[root(p)] = root(q);
    }
    
    public static void main(String[] args) {
        int n = 10;
        QuickUnion q = new QuickUnion(n);
        q.union(1, 2);
        q.union(2, 3);
        for (int i = 0; i < n; i++) 
            System.out.print(q.id[i] + " ");
    }
}
