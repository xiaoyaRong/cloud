package provider.dao;

import com.rxy.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author rongxiaoya
 */
@Mapper
@Repository
public interface DeptDao {

    Dept selectOne(Integer id);

    List<Dept> selectList();



}
