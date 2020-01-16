package com.cq.cloud.service;

import com.cq.cloud.api.Dept;

import java.util.List;

/**
 * @author 彭国仁
 * @data 2020/1/15 10:57
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
