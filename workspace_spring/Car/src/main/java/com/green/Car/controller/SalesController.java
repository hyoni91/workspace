package com.green.Car.controller;

import com.green.Car.service.SalesService;
import com.green.Car.vo.SalesVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/sales")
@RestController
public class SalesController {
    @Resource(name = "salesService")
    private SalesService salesService;

    @PostMapping("/insert")
    public void insert(@RequestBody SalesVO salesVO){
        System.out.println(salesVO);
        salesService.insert(salesVO);
    }

    @GetMapping("/select")
    public List<SalesVO> select(){
        return salesService.select();
    }
}
