package com.green.Car.service;

import com.green.Car.vo.CarVO;

import java.util.List;

public interface CarService {

    void insert (CarVO carVO);

    List<CarVO> select();
}
