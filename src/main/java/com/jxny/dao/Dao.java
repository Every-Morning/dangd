package com.jxny.dao;

import com.jxny.userForm.User;

import java.util.List;

public interface Dao<T> {
    int add(T t);
    int delete(String uphnum);
    boolean updata(T t);
    List<T> queryAll();
    T queryOne(String uphnum);
    T isExist(String uphnum);
}
