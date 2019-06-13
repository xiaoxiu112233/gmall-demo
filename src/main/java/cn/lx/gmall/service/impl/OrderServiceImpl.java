package cn.lx.gmall.service.impl;

import cn.lx.gmall.service.bean.UserAddress;
import cn.lx.gmall.service.interf.OrderService;
import cn.lx.gmall.service.interf.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID：" + userId);
        //根据用户ID查询用户的收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for(UserAddress userAddress:userAddressList)
            System.out.println(userAddress);
        return userAddressList;
    }
}
