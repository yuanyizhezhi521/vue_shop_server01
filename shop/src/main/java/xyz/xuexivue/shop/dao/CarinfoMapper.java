package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Carinfo;

public interface CarinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    Carinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);
}