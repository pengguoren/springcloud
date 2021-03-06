package com.cq.cloud.controller;

import com.cq.cloud.api.Dept;
import com.cq.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DeptController_Consumer {

	@Resource
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	{
		return service.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return service.list();
	}
}
