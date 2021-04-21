package com.jhkim.pf.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhkim.pf.mapper.mapper;


// 서비스라고 알려줌
@Service
// DB에러시 자동롤백
@Transactional
public class service {
	
	@Autowired
	private mapper mapper;
	
	public int insert() {
		return mapper.insert();
	}
	
}
