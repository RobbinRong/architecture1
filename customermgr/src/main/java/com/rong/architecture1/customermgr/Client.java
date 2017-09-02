package com.rong.architecture1.customermgr;

import com.rong.architecture1.customermgr.dao.CustomerDAO;
import com.rong.architecture1.customermgr.service.ICustomerService;
import com.rong.architecture1.customermgr.vo.CustomerModel;
import com.rong.architecture1.customermgr.vo.CustomerQueryModel;
import com.rong.pageUtil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Client {

    @Autowired
    private ICustomerService service=null;

    public ICustomerService getService(){
        return service;
    }
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        Client client= (Client) ctx.getBean("client");
        CustomerModel cm=new CustomerModel();
        cm.setCustomerId("c1");
        cm.setPwd("c1");
        cm.setShowName("111");
        cm.setRegisterTime("123");
        cm.setTrueName("张三");
//        client.dao.create(cm);
        CustomerQueryModel customerQueryModel = new CustomerQueryModel();
        customerQueryModel.getPage().setNowPage(2);
        customerQueryModel.getPage().setPageShow(2);
        Page<CustomerModel> byConditionPage = client.getService().getByConditionPage(customerQueryModel);
        System.out.println("list==="+byConditionPage);

    }

}
