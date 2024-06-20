package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVO {
    private String ordertype;
    private int num;
    private String[] sauce;
    private String request;

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getSauce() {
        return sauce;
    }

    public void setSauce(String[] sauce) {
        this.sauce = sauce;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }


    @Override
    public String toString() {
        return "OrderVO{" +
                "ordertype='" + ordertype + '\'' +
                ", num=" + num +
                ", sauce=" + Arrays.toString(sauce) +
                ", request='" + request + '\'' +
                '}';
    }
}
