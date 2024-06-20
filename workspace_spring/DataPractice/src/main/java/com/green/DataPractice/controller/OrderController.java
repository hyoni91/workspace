package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("order")
    public String order(OrderVO orderVO){
        return "order";
    }

    @PostMapping("/delivery")
    public String delivery(OrderVO orderVO){
        System.out.println(orderVO);
        return "delivery";
    }

    @PostMapping("/order_info")
    public String order_info(OrderVO orderVO, DeliveryVO deliveryVO, Model m){
        System.out.println(orderVO);
        System.out.println(deliveryVO);
        int cnt = 0;
        for(String e : orderVO.getSauce()){
            cnt++;
        }
        int sum = (cnt*1000) + (orderVO.getNum()*10000);

        m.addAttribute("sum",sum);

        return "order_info";
    }


}
