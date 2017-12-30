package com.chapter1;

public abstract class AbstractUnionFind implements UnionFind {
    protected int[] ids;//分量id
    protected int count;//分量数量

    public AbstractUnionFind(int n){
        count = n;
        ids = new int[n];
        for(int i=0;i<n;i++){
            ids[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isConnected(int p, int q) {
        return find(p)==find(q);
    }

    public void printlnDetail(){
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }
    }
}
