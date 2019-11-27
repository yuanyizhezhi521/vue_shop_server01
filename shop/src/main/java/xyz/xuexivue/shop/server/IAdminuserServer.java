package xyz.xuexivue.shop.server;

import xyz.xuexivue.shop.pojo.Adminuser;

public interface IAdminuserServer {
    int deleteByPrimaryKey(Integer uid);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    Adminuser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
}
