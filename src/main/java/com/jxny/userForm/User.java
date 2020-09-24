package com.jxny.userForm;

public class User {
    private int uid;
    private String uname;
    private String uphnum;
    private String upassword;

    public User() {
    }

    public User(int uid, String uname, String uphnum, String upassword) {
        this.uid = uid;
        this.uname = uname;
        this.uphnum = uphnum;
        this.upassword = upassword;
    }

    public User(String uphnum, String uname, String upassword) {
        this.uname = uname;
        this.uphnum = uphnum;
        this.upassword = upassword;
    }

    public User(String uphnum, String upassword) {
        this.uphnum = uphnum;
        this.upassword = upassword;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphnum() {
        return uphnum;
    }

    public void setUphnum(String uphnum) {
        this.uphnum = uphnum;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uphnum='" + uphnum + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
