package com.selenum.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.UserAgent;

@Repository
public interface UserAgentDao {
	
	Integer findCount();
	
	UserAgent findOneByLimit(@Param("limit") Integer limit);

	void insert(UserAgent userAgent);
}
