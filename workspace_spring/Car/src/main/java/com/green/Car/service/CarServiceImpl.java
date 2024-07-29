package com.green.Car.service;

import com.green.Car.vo.CarVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insert(CarVO carVO) {
        sqlSession.insert("carMapper.insert", carVO);
    }

    @Override
    public List<CarVO> select() {
        return sqlSession.selectList("carMapper.select");
    }
}
