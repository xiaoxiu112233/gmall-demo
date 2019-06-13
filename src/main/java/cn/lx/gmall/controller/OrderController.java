package cn.lx.gmall.controller;

import cn.lx.gmall.service.bean.UserAddress;
import cn.lx.gmall.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping
    @ResponseBody
    public List<UserAddress> initOrder(String userId){
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        for (UserAddress address:userAddresses)
            System.out.println(address);
        return userAddresses;
    }
}
