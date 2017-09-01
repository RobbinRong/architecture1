package com.rong.architecture1.customermgr.dao;

import org.springframework.stereotype.Repository;

import com.rong.architecture1.customermgr.vo.CustomerModel;

@Repository
public interface CustomerDAO{

	public CustomerModel getByCustomerId(String customerId);
}
