package com.green.ReactGoods.vo;


import lombok.Data;

@Data
public class OrderVO {
    private int orderNum; //주문번호
    private String buyItemName; //구매 상품명
    private int buyItemPrice; //구매 상품 단가
    private String buyer; // 구매자
    private int buyCnt; //구매수량
    private int buyPrice; //구매가격 (단가*수량)
    private String buyDate;

}
