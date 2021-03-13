package com.tom;

public class Costomer {
    int id;
    int off;
    int cost;


    public costomers(int id,int cost,int off) {
        this.id = id;
        this.cost = cost;
        this.off = off;
    }
    public void print(){
        System.out.println(id + "\t" + cost + "\t" +off + "\t" + (cost-off));
    }



}
