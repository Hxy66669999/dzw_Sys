package org.java10.dzw.action.lyw;

import org.java10.dzw.biz.lyw.CommodityBiz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons/lyw/Commodityaction")
public class Commodityaction {

            @Autowired
            private CommodityBiz CommodityBiz;

            @GetMapping("/Querythebrand")
            public APIResponse   chaxun(){
                APIResponse apiResponse = new APIResponse();
                List<commodity> list =CommodityBiz.chauxn();
                apiResponse=new APIResponse(200,list,"成功");
                return apiResponse;
            }
}
