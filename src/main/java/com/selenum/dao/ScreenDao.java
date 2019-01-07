package com.selenum.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.Screen;

@Repository
public interface ScreenDao {

	Integer findCount();
	
	Screen findOneByLimit(@Param("limit") Integer limit);
}
