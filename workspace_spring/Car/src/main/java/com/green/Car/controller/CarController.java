package com.green.Car.controller;

import com.green.Car.service.CarService;
import com.green.Car.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Resource(name = "carService")
    private CarService carService;

    @PostMapping("/insert")
    public void insert(@RequestBody CarVO carVO){
        carService.insert(carVO);
    }

    @GetMapping("/select")
    public List<CarVO> select(){
       return carService.select();
    }
}
