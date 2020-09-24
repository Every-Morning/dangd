package com.jxny.dao.impl;

import com.jxny.dao.Dao;
import com.jxny.userForm.User;
import com.jxny.util.JDBCutil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserImpl implements Dao<User> {
    private JdbcTemplate template =null;

   public UserImpl(){
        DataSource dataSource= JDBCutil.getDataSource();
        template=new JdbcTemplate(dataSource);
    }

    @Override
    public int add(User user) {
        String sql="INSERT INTO `ddang`.`user_tb`(`uname`, `uphnum`, `upassword`) VALUES (?,?,?)";
        Object obj[]={user.getUname(),user.getUphnum(),user.getUpassword()};
        int count=template.update(sql,obj);
        return count;
    }

    @Override
    public int delete(String uphnum) {
       String sql="DELETE FROM `ddang`.`user_tb` WHERE `uphnum` = ?";
       int count=template.update(sql,uphnum);
        return 0;
    }

    @Override
    public boolean updata(User user) {
       String sql="UPDATE `ddang`.`user_tb` SET `uname` = ?, `upassword` = ? WHERE `uphnum` = ?";
        Object obj[]={user.getUname(),user.getUpassword(),user.getUphnum()};
        int count=template.update(sql,obj);
        return false;
    }

    @Override
    public List<User> queryAll() {
        String sql="SELECT * FROM `ddang`.`user_tb` LIMIT 0, 1000";
        List<User> list=template.query(sql, new BeanPropertyRowMapper<>(User.class));
       return list;
    }

    @Override
    public User queryOne(String uphnum) {
        String sql="SELECT * FROM `ddang`.`user_tb` WHERE `uphnum` = ?";
        User user=null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uphnum);
        }catch (DataAccessException e){
            user=null;
        }
        return user;
    }

    @Override
    public User isExist(String uphnum) {
       String sql="SELECT * FROM `ddang`.`user_tb` WHERE `uphnum` = ?";
        User user=null;
       try {
           user =template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uphnum);

       }catch (DataAccessException e){
           user=null;
       }
        return user;
    }

}
