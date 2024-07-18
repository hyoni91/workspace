package com.green.ReactGoods.controller;

import com.green.ReactGoods.service.ItemService;
import com.green.ReactGoods.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Resource(name="itemService")
    private ItemService itemService;

    // 상품 정보
    @GetMapping("/itemList")
    public List<ItemVO> itemList(){
        System.out.println(itemService.itemList());
        return itemService.itemList();
    }

    //상품 등록
    @PostMapping("/itemInsert")
    public void itemInsert(@RequestBody ItemVO itemVO) {
        System.out.println(itemVO);
        itemService.itemInput(itemVO);
    }

    //상품 상세
    @GetMapping("/itemDetail/{itemNum}")
    public ItemVO itemDetail(@PathVariable("itemNum") int itemNum){
        System.out.println(itemNum);
        return itemService.itemDetail(itemNum);

    }

    //상품 정보 수정
    @PutMapping("/itemUpdate")
    public void itemUpdate(@RequestBody ItemVO itemVO){
        itemService.itemUpdate(itemVO);
    }


    }

