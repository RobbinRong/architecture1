package com.rong.architecture1.customermgr.service;

import com.rong.architecture1.customermgr.dao.CustomerDAO;
import com.rong.architecture1.customermgr.vo.CustomerModel;
import com.rong.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerService extends com.rong.architechture1.common.service.BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
	private CustomerDAO dao = null;
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public CustomerModel getByCustomerId(String customerId) {
		return dao.getByCustomerId(customerId);
	}
	
}
