package com.green.Car.vo;

import lombok.Data;

@Data
public class SalesVO {
    private int salesNum;
    private String buyer;
    private String buyerTel;
    private String color;
    private int modelNum;
    private String sDate;
    private CarVO carVO;
}
