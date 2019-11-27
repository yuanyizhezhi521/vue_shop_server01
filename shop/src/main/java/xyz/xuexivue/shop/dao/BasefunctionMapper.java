package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Basefunction;

public interface BasefunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Basefunction record);

    int insertSelective(Basefunction record);

    Basefunction selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Basefunction record);

    int updateByPrimaryKey(Basefunction record);
}