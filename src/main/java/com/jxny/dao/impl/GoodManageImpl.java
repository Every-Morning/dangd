package com.jxny.dao.impl;

import com.jxny.dao.GoodsManage;
import com.jxny.userForm.Goods;
import com.jxny.userForm.User;
import com.jxny.util.JDBCutil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class GoodManageImpl implements GoodsManage<Goods> {
    private JdbcTemplate template =null;

    public GoodManageImpl(){
        DataSource dataSource= JDBCutil.getDataSource();
        template=new JdbcTemplate(dataSource);
    }

    @Override
    public int add(Goods goods) {
        String sql="INSERT INTO `ddang`.`goods_tb`(`bname`, `bprice`, `binvty`, `ident`) VALUES (?,?,?,?)";
        Object obj[]={goods.getBname(),goods.getBprice(),goods.getBinvty(),goods.getIdent()};
        int count=template.update(sql,obj);
        return count;
    }

    @Override
    public int delete(int ident) {
        String sql="DELETE FROM `ddang`.`goods_tb` WHERE `ident` = ?";
        int count=template.update(sql,ident);
        return 0;
    }

    @Override
    public int updata(Goods goods) {
        String sql="UPDATE `ddang`.`goods_tb` SET `bname` = ?, `bprice` = ?, `binvty` = ?  WHERE `ident` = ?";
        Object obj[]={goods.getBname(),goods.getBprice(),goods.getBinvty(),goods.getIdent()};
        int count=template.update(sql,obj);
        return 0;
    }

    @Override
    public List<Goods> queryAll() {
        String sql="SELECT * FROM `ddang`.`goods_tb` LIMIT 0, 1000";
        List<Goods> list=template.query(sql, new BeanPropertyRowMapper<>(Goods.class));
        return list;
    }

    @Override
    public Goods queryOne(int ident) {
        String sql="SELECT * FROM `ddang`.`goods_tb` WHERE `ident` = ?";
        Goods goods=null;
        try {
            goods = template.queryForObject(sql, new BeanPropertyRowMapper<>(Goods.class), ident);
        }catch (DataAccessException e){
            goods=null;
        }
        return goods;
    }
}
