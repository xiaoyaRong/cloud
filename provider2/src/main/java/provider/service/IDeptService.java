package provider.service;

import com.rxy.entity.Dept;

import java.util.List;

public interface IDeptService {

    Dept selectOne(Integer id);

    List<Dept> selectList();

}
