package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Baserole;

public interface BaseroleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Baserole record);

    int insertSelective(Baserole record);

    Baserole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Baserole record);

    int updateByPrimaryKey(Baserole record);
}