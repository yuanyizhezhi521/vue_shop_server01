package xyz.xuexivue.shop.server;

import xyz.xuexivue.shop.pojo.User;

import java.util.List;

public interface IUserServer {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUserAll();
}
