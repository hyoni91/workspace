package com.green.Shop_answer.item.controller;

import com.green.Shop_answer.item.service.ItemService;
import com.green.Shop_answer.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api_item")
public class ItemController {

    @Resource(name = "itemService")
    private ItemService itemService;

    @GetMapping("/itemDetail/{itemCode}")
    public ItemVO itemDetail(@PathVariable("itemCode") int itemCode){
        System.out.println(itemCode);
        return itemService.itemDetail(itemCode);
    }
}
