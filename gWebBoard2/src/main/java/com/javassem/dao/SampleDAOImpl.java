package com.javassem.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAOImpl implements SampleDAO{
	
	//DB 커넥션을 대신 해주는 애
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public String sample() {
		
		//return mybatis.select("emp");
		return sqlSession.selectOne("ss.getDate");
	}
}
