package com.jxny.service;

import java.util.List;

public interface GoodsService<T> {
    int add(T t);
    int delete(int ident);
    int updata(T t);
    List<T> queryAll();
    T queryOne(int ident);
}
