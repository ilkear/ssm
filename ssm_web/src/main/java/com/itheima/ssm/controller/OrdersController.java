package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList = ordersService.findAll();
        mv.addObject("ordersList",ordersList);
        mv.setViewName("orders-list");
        return mv;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){

        ModelAndView mv = new ModelAndView();
        Orders orders = ordersService.findById(id);
        System.out.println(orders);
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");
        return mv;
    }
}
