package com.green.Shop_answer.cart.service;

import com.green.Shop_answer.cart.vo.CartVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public void cartInsert(CartVO cartVO) {
        sqlSession.insert("answerCartMapper.cartInsert",cartVO);
    }

    @Override
    public List<CartVO> cartList(String memId) {
        return sqlSession.selectList("answerCartMapper.cartList", memId);

    }

    @Override
    public void cartDelete(int cartCode) {
        sqlSession.delete("answerCartMapper.delete", cartCode);
    }


}
