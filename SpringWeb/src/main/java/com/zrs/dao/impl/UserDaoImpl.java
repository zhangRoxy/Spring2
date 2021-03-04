package com.zrs.dao.impl;

import com.zrs.bean.User;
import com.zrs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Repository  //区分
public class UserDaoImpl implements UserDao {

    @Resource  //不是调用set方法
    private DataSources ds=null;

    public List<User> getUsers() {
        System.out.println("模拟查询数据库,连接的数据库是:"+ds);
        User u1=new User(111,"刘备","男","小乔");
        User u2=new User(222,"关羽","男","耍大刀");
        User u3=new User(333,"张飞","男","卖猪肉");
        User u4=new User(444,"诸葛亮","男","装逼");
        List<User> list=new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        return list;
    }
}
