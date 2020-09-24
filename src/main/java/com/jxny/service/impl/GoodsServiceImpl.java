package com.jxny.service.impl;

import com.jxny.dao.impl.GoodManageImpl;
import com.jxny.service.GoodsService;
import com.jxny.userForm.Goods;

import java.util.List;

public class GoodsServiceImpl implements GoodsService<Goods> {
    private GoodManageImpl impl=null;
    public GoodsServiceImpl(){
        impl= new GoodManageImpl();
    }
    @Override
    public int add(Goods goods) {
        impl.add(goods);
        return 0;
    }

    @Override
    public int delete(int ident) {
        impl.delete(ident);
        return 0;
    }

    @Override
    public int updata(Goods goods) {
        impl.updata(goods);
        return 0;
    }

    @Override
    public List<Goods> queryAll() {
        return impl.queryAll();
    }

    @Override
    public Goods queryOne(int ident) {
        return impl.queryOne(ident);
    }
}
