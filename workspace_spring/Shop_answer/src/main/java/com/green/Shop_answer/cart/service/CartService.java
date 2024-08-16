package com.green.Shop_answer.cart.service;

import com.green.Shop_answer.cart.vo.CartVO;

import java.util.List;

public interface CartService {
     //장바구니 담기
    void cartInsert(CartVO cartVO);

    //장바구니 목록
    List<CartVO> cartList(String memId);

    //장바구니 삭제
    void cartDelete(int cartCode);
}
