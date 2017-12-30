package com.chapter1;

public class WeightedQuickUnionFind extends QuickUnionFind {


    public WeightedQuickUnionFind(int n) {
        super(n);
    }



    public int find(int p) {
        int cur = p,next;
        while(p != ids[p]){
            p = ids[p];
        }
        while(ids[cur] != p) {
            next = ids[cur];
            ids[cur] = p;
            cur = next;
        }
        return p;
    }

    public static void main(String[] args){
        WeightedQuickUnionFind weightedQuickUnionFind = new WeightedQuickUnionFind(6);
        weightedQuickUnionFind.union(0,1);
        weightedQuickUnionFind.union(0,2);
        weightedQuickUnionFind.union(0,3);
        weightedQuickUnionFind.union(0,4);
        //System.out.println(weightedQuickUnionFind.isConnected(1,3));
        weightedQuickUnionFind.printlnDetail();
    }

}
