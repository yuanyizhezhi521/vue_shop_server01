package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Salesman;

public interface SalesmanMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Salesman record);

    int insertSelective(Salesman record);

    Salesman selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Salesman record);

    int updateByPrimaryKey(Salesman record);
}