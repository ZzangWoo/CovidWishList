package com.doongzzi.web.dao;

import org.springframework.stereotype.Repository;

import com.doongzzi.web.model.TestModel;

@Repository("testMapper")
public interface TestMapper {

	public int testInsert(TestModel testModel);
	
}
