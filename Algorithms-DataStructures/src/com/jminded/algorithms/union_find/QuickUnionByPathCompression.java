package com.jminded.algorithms.union_find;

public class QuickUnionByPathCompression {

    public int[] id;
    private int[] size;
  
    public QuickUnionByPathCompression(int n){
        id = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }
    
    private int root(int p) {
        while (p!=id[p]) {
        	id[p]=id[id[p]];  //Path Compression
        	p = id[p];
        }
        return p;
    }
    
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (size[i] < size[j]) { 
        	id[i] = j; 
        	size[j] += size[i]; 
        	}
        else{ 
        	id[j] = i; 
        	size[i] += size[j]; 
        	} 
    }
    
    public static void main(String[] args) {
        int n = 10;
        QuickUnionWeighted q = new QuickUnionWeighted(n);
        q.union(8, 1);
        q.union(6, 3);
        q.union(5, 0);
        q.union(4, 7);
        q.union(3, 8);
        q.union(4, 9);
        q.union(5, 4);
        q.union(7, 6);
        q.union(7, 2);
        for (int i = 0; i < n; i++) 
            System.out.print(q.id[i] + " ");
    }
}
