package xyz.xuexivue.shop.dao;

import xyz.xuexivue.shop.pojo.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}