package com.rong.architecture1.customermgr.web;

import com.rong.architecture1.customermgr.service.ICustomerService;
import com.rong.architecture1.customermgr.vo.CustomerModel;
import com.rong.architecture1.customermgr.vo.CustomerQueryModel;
import com.rong.pageUtil.Page;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rongjiabin on 2017/9/2.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService ics=null;
    @RequestMapping(value = "toAdd",method = RequestMethod.GET)
    public String toAdd(){
        return "customer/add";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(@ModelAttribute("cm") CustomerModel cm){
        ics.create(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}",method = RequestMethod.GET)
    public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid){
        CustomerModel customerModel = ics.getByUuid(customerUuid);
        model.addAttribute("cm",customerModel);
        return "customer/update";
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(@ModelAttribute("cm") CustomerModel cm){
        ics.update(cm);
        return "customer/success";
    }
    @RequestMapping(value = "toDelete{customerUuid}",method = RequestMethod.GET)
    public String toDelete(Model model, @PathVariable("customerUuid") int customerUuid){
        CustomerModel customerModel = ics.getByUuid(customerUuid);
        model.addAttribute("cm",customerModel);
        return "customer/delete";
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public String delete(@RequestParam("uuid") int customerUuid){
        ics.delete(customerUuid);
        return "customer/success";
    }
    @RequestMapping(value = "toList",method = RequestMethod.GET)
    public String toList(@RequestParam("queryJsonStr") String queryJson, @ModelAttribute("page")Page page){
        CustomerQueryModel cqm=null;
        if(queryJson==null ||queryJson.trim().length()==0){
            cqm=new CustomerQueryModel();
        }

        return "customer/success";
    }

}
