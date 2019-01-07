package com.selenum.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.selenum.model.AuWish;

@Repository
public interface AuWishDao {

	public AuWish findOne(@Param("type") Integer type);
	
	public int updateStatusById(@Param("status") Integer status, @Param("id") Long id);

	public void insert(AuWish wish);

	public void update(AuWish wish);
}
