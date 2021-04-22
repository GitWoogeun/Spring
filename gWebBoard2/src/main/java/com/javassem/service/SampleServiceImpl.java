package com.javassem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.SampleDAO;

//실질적으로 Service해결
@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	SampleDAO sampleDAO;
	
	@Override
	public String sample() {
		
		return sampleDAO.sample();
	}
}
