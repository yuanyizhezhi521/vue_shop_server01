package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.BaseRoleFunction;

public interface BaseRoleFunctionMapper {
    int deleteByPrimaryKey(Integer rmid);

    int insert(BaseRoleFunction record);

    int insertSelective(BaseRoleFunction record);

    BaseRoleFunction selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(BaseRoleFunction record);

    int updateByPrimaryKey(BaseRoleFunction record);
}