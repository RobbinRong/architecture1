package com.rong.architecture1.customermgr.service;

import com.rong.architecture1.common.service.IBaseService;
import com.rong.architecture1.customermgr.vo.CustomerModel;
import com.rong.architecture1.customermgr.vo.CustomerQueryModel;

public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
