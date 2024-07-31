package com.green.Car.service;

import com.green.Car.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public interface SalesService {

    void insert (SalesVO salesVO);

    List<SalesVO> select();
}
