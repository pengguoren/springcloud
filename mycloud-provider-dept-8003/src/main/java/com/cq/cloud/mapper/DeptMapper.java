package com.cq.cloud.mapper;

import com.cq.cloud.api.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 彭国仁
 * @data 2020/1/15 10:51
 */
@Mapper
@Component
public interface DeptMapper {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
