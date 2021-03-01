package com.doongzzi.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.doongzzi.web.dao.TestMapper;
import com.doongzzi.web.model.TestModel;

@Service("testService")
public class TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public int testInsert(TestModel testModel) throws Exception {
		int count = testMapper.testInsert(testModel);
				
		return count;
	}
	
}
