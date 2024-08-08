package com.green.Shop_answer.admin.Service;

import com.green.Shop_answer.item.vo.CategoryVO;
import com.green.Shop_answer.item.vo.ItemVO;

import java.util.List;

public interface AdminService {

    //category 목록조회
    List<CategoryVO> categoryList();

    //아이템 등록
    void insetItem(ItemVO itemVO);

    //상품이지미등록
    void insertImgs(ItemVO itemVO);

    //다음에 들어갈 item_code 조회
    int getNextItemCode();
}
