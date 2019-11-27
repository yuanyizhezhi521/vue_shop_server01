package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Basedept;

public interface BasedeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Basedept record);

    int insertSelective(Basedept record);

    Basedept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(Basedept record);

    int updateByPrimaryKey(Basedept record);
}