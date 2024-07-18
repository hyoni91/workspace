package com.green.ReactGoods.service;

import com.green.ReactGoods.vo.ItemVO;

import java.util.List;

public interface ItemService {

    //상품 정보 조회
    List<ItemVO> itemList();

    //상품 등록
    void itemInput(ItemVO itemVO);

    //상품 조회
    ItemVO itemDetail(int itemNum);

    //상품 정보 수정
    void itemUpdate(ItemVO itemVO);
}
