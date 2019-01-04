package com.selenum.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.UsDataState;

@Repository
public interface UsDataStateDao {
	
	UsDataState findByStateCode(@Param("code") String code);
}
