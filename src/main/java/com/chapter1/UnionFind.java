package com.chapter1;

public interface UnionFind {

    public int getCount();

    public boolean isConnected(int p,int q);

    public int find(int p);

    public void union(int p,int q);

}
