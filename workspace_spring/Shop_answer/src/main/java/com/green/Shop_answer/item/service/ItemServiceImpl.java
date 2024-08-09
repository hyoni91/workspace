package com.green.Shop_answer.item.service;

import com.green.Shop_answer.item.vo.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public ItemVO itemDetail(int itemCode) {
        return sqlSession.selectOne("answerItemMapper.itemDetail", itemCode);
    }
}
