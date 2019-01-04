package com.selenum.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.UsData;

@Repository
public interface UsDataDao {
	
	UsData findByUseStatus(@Param("status") Integer status);

	void updateStatusById(@Param("status") String status,@Param("id") Long id, @Param("submitTime") Date date);

	void insert(UsData d);

	UsData findByFirstNameIsNull();

	void update(UsData d);

	UsData findByEmailIsNull();
}
