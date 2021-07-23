package com.rxy.provider.service;

import com.rxy.entity.Dept;
import com.rxy.provider.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept selectOne(Integer id) {
        return deptDao.selectOne(id);
    }

    @Override
    public List<Dept> selectList() {
        return deptDao.selectList();
    }
}
