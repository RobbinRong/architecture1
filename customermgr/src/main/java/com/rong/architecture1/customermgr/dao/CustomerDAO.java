package com.rong.architecture1.customermgr.dao;

import com.rong.architechture1.common.dao.BaseDAO;
import com.rong.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import com.rong.architecture1.customermgr.vo.CustomerModel;


@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel> {
    CustomerModel getByCustomerId(String customerId);

}
