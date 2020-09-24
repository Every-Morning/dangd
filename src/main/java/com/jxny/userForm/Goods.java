package com.jxny.userForm;

public class Goods {
    private int bid;
    private String bname;
    private double bprice;
    private int  binvty;
    private int ident;

    public Goods() {
    }

    public Goods(int bid, String bname, double bprice, int binvty ,int ident) {
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
        this.ident=ident;
        this.binvty = binvty;
    }

    public Goods(String bname, double bprice, int binvty, int ident) {
        this.bname = bname;
        this.bprice = bprice;
        this.binvty = binvty;
        this.ident = ident;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public int getBinvty() {
        return binvty;
    }

    public void setBinvty(int binvty) {
        this.binvty = binvty;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bprice=" + bprice +
                ", binvty=" + binvty +
                ", ident=" + ident +
                '}';
    }
}
