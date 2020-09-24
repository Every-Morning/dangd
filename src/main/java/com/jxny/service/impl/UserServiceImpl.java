package com.jxny.service.impl;

import com.jxny.dao.impl.UserImpl;
import com.jxny.service.UserService;
import com.jxny.userForm.User;

import java.util.List;

public class UserServiceImpl implements UserService<User> {
    private UserImpl userimpl=null;
    public UserServiceImpl(){
        userimpl= new UserImpl();
    }
    @Override
    public int add(User user) {
        userimpl.add(user);
        return 0;
    }

    @Override
    public int delete(String uphnum) {
        userimpl.delete(uphnum);
        return 0;
    }

    @Override
    public boolean updata(User user) {//传入一个user改变
        userimpl.updata(user);
        return false;
    }

    @Override
    public List<User> queryAll() {
        List<User> list=userimpl.queryAll();
        return list;
    }

    @Override
    public User queryOne(String uphnum) {

        return userimpl.queryOne(uphnum);
    }

    @Override
    public boolean islogin(User user) {
        User user1=userimpl.isExist(user.getUphnum());
        if(user1!=null){
            if(user1.getUpassword().equals(user.getUpassword()))
                return true;
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        User user1=userimpl.isExist(user.getUphnum());
        if(user1!=null){
                return false;
        }
        return true;
    }


}
