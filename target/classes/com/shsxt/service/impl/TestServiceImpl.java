package com.shsxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsxt.dao.ITestDao;
import com.shsxt.model.Test;
import com.shsxt.service.ITestService;
@Service
public class TestServiceImpl implements ITestService {
	@Autowired
	private ITestDao testDao;

	public Test queryTestByName(String name) {
		
		return testDao.getTestbyname(name);
	}

	

}
