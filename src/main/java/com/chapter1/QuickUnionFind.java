package com.chapter1;

public class QuickUnionFind extends AbstractUnionFind{

    public QuickUnionFind(int n){
        super(n);
    }


    public int find(int p) {
        while(p!=ids[p]){
            p = ids[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int idP = find(p);
        int idQ = find(q);
        if(idP == idQ) {
            return;
        }
        ids[idP] = idQ;
        count--;
    }

    public static void main(String[]args){
        QuickUnionFind quickUnionFind = new QuickUnionFind(6);
        quickUnionFind.union(0,1);
        quickUnionFind.union(0,3);
        System.out.println(quickUnionFind.isConnected(1,3));
        System.out.println(quickUnionFind.getCount());
    }
}
