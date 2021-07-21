package provider.service;

import com.rxy.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import provider.dao.DeptDao;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptDao deptDao;

    public Dept selectOne(Integer id) {
        return deptDao.selectOne(id);
    }

    public List<Dept> selectList() {
        return deptDao.selectList();
    }
}
