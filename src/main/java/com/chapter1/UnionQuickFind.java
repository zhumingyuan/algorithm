package com.chapter1;

public class UnionQuickFind extends AbstractUnionFind{


    public UnionQuickFind(int n){
        super(n);
    }

    public int find(int p){
        return ids[p];
    }

    public void union(int p,int q){
        int idP = find(p);
        int idQ = find(q);
        if(idP == idQ) {
            return;
        }
        for(int i=0;i<ids.length;i++){
            if(ids[i]== idP){
                ids[i] = idQ;
            }
        }
        count--;
    }

    public static void main(String[]args){
        UnionQuickFind unionQuickFind = new UnionQuickFind(6);
        unionQuickFind.union(0,1);
        unionQuickFind.union(0,3);
        System.out.println(unionQuickFind.isConnected(1,3));
        System.out.println(unionQuickFind.getCount());
    }
}
