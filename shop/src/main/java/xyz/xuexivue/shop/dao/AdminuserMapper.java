package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Adminuser;

public interface AdminuserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    Adminuser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
}