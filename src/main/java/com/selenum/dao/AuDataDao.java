package com.selenum.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.AuData;

@Repository
public interface AuDataDao {
	
	AuData findByUseStatus(@Param("status") Integer status);

	void updateStatusById(@Param("status") String status,@Param("id") Long id, @Param("submitTime") Date date, @Param("offerUrl") String offerUrl);

	void insert(AuData d);

	AuData findByFirstNameIsNull();

	void update(AuData d);

	AuData findByEmailIsNull();

	AuData findBirthYearIsNull();
}
