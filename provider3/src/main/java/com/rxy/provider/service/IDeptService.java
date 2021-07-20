package com.rxy.provider.service;

import com.rxy.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDeptService {

    Dept selectOne(Integer id);

    List<Dept> selectList();

}
