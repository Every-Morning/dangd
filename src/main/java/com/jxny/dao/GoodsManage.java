package com.jxny.dao;

import java.util.List;

public interface GoodsManage<T> {
    int add(T t);
    int delete(int ident);
    int updata(T t);
    List<T> queryAll();
    T queryOne(int ident);

}
