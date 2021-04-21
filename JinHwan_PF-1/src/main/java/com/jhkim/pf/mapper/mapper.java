package com.jhkim.pf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


// DAO라고 알려주는 의미
@Repository
// mapper로 사용하겠다 
// Spring은 controller -> service -> serviceImpl -> mapper(dao) -> DB순
@Mapper
public interface mapper {
	
	public int insert();
	
}
