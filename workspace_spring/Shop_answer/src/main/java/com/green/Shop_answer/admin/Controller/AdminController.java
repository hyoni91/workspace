package com.green.Shop_answer.admin.Controller;


import com.green.Shop_answer.admin.Service.AdminService;
import com.green.Shop_answer.item.vo.CategoryVO;
import com.green.Shop_answer.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_admin")
public class AdminController {

    @Resource(name = "adminService")
    private AdminService adminService;

    @GetMapping("/categoryList")
    public List<CategoryVO> getCategoryList(){
        return adminService.categoryList();
    }

    //item 등록
    @PostMapping("/insertItem")
    public void insetItem(@RequestBody ItemVO itemVO){
        System.out.println(itemVO);
        adminService.insetItem(itemVO);
    }

}
