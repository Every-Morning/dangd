package com.jxny.service;

import java.util.List;

public interface UserService<T> {
    int add(T t);
    int delete(String uphnum);
    boolean updata(T t);
    List<T> queryAll();
    T queryOne(String uphnum);
    boolean islogin(T t);
    boolean register(T t);
}
