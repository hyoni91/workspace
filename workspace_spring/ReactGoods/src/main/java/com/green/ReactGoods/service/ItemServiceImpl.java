package com.green.ReactGoods.service;


import com.green.ReactGoods.vo.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<ItemVO> itemList() {
        return sqlSession.selectList("itemMapper.itemList");
    }

    @Override
    public void itemInput(ItemVO itemVO) {
        sqlSession.insert("itemMapper.insert", itemVO);
    }

    @Override
    public ItemVO itemDetail(int itemNum) {
        return sqlSession.selectOne("itemMapper.detail", itemNum);
    }

    @Override
    public void itemUpdate(ItemVO itemVO) {
        sqlSession.update("itemMapper.update", itemVO);
    }
}
