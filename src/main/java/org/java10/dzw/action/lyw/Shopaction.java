package org.java10.dzw.action.lyw;


import org.java10.dzw.biz.lyw.ShopBiz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/persons/lyw/data1")
public class Shopaction {

            @Autowired
            private ShopBiz ShopBiz;

            /*删除*/
            @GetMapping("/delete1/{id}")
            public  APIResponse delete1(@PathVariable Integer id){
                APIResponse apiResponse = new APIResponse();
                System.out.println("删除"+id);

                Integer list  =ShopBiz.deleteomt(id);
                    apiResponse=new APIResponse(200,list,"成功");

                return apiResponse;

            }
            /*根据id来查询*/
        @GetMapping("/Query/{id}")
        public  APIResponse chaxun2(@PathVariable Integer id){
            APIResponse apiResponse = new APIResponse();
            System.out.println("删除"+id);
            List<shop> list  =ShopBiz.deleteomt2(id);
            apiResponse=new APIResponse(200,list,"成功");

            return apiResponse;

        }

    /*根据id来修改*/
    @PostMapping("/Goodschange")
    public  APIResponse Goodschange(@RequestBody shop shop){
        APIResponse apiResponse = new APIResponse();
        shop.setShopcreator("lyw");
        shop.setShopdate(new Date());
        shop.setShopmodifier("lyw");
        shop.setShopeupdatetime(new Date());
        shop.setShopremove(0);
        Integer list  =ShopBiz.xiugaishangpin(shop);
        apiResponse=new APIResponse(200,list,"成功");

        return apiResponse;

    }
    /*根据id来修改*/
    @PostMapping("/Thenewgoods")
    public  APIResponse Thenewgoods(@RequestBody shop shop){
        APIResponse apiResponse = new APIResponse();
        shop.setShopcreator("lyw");
        shop.setShopdate(new Date());
        shop.setShopmodifier("lyw");
        shop.setShopeupdatetime(new Date());
        shop.setShopremove(0);
        Integer list  =ShopBiz.xinzeng(shop);
        apiResponse=new APIResponse(200,list,"成功");

        return apiResponse;

    }



}
