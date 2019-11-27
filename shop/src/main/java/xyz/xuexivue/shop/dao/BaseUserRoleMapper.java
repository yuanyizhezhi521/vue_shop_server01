package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.BaseUserRole;

public interface BaseUserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(BaseUserRole record);

    int insertSelective(BaseUserRole record);

    BaseUserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(BaseUserRole record);

    int updateByPrimaryKey(BaseUserRole record);
}