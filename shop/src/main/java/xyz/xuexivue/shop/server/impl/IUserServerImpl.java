package xyz.xuexivue.shop.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xuexivue.shop.dao.UserMapper;
import xyz.xuexivue.shop.pojo.User;
import xyz.xuexivue.shop.server.IUserServer;

import java.util.List;

@Service
public class IUserServerImpl implements IUserServer {
    @Autowired
   private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectUserAll() {
        return userMapper.selectUserAll();
    }
}
