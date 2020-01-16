package com.cq.cloud.controller;

import com.cq.cloud.api.Dept;
import com.cq.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 彭国仁
 * @data 2020/1/15 11:07
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/gets/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }
}
