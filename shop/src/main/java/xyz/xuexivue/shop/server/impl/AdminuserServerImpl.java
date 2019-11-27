package xyz.xuexivue.shop.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xuexivue.shop.dao.AdminuserMapper;
import xyz.xuexivue.shop.pojo.Adminuser;
import xyz.xuexivue.shop.server.IAdminuserServer;
@Service
public class AdminuserServerImpl implements IAdminuserServer {
    @Autowired
   private AdminuserMapper adminuserMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return adminuserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Adminuser record) {
        return adminuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Adminuser record) {
        return adminuserMapper.insertSelective(record);
    }

    @Override
    public Adminuser selectByPrimaryKey(Integer uid) {
        return adminuserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(Adminuser record) {
        return adminuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Adminuser record) {
        return adminuserMapper.updateByPrimaryKey(record);
    }
}
