package org.java10.dzw.action.lyw;


import org.java10.dzw.biz.lyw.LianZha1Biz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.vo.LianZha1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons/lyw")
public class LianZhaaction {

            @Autowired
            private LianZha1Biz LianZha1Biz;

            @GetMapping("/chaxunshangpin/{id}")
            public APIResponse chaxun(@PathVariable Integer id){
                APIResponse  apiResponse = new APIResponse();
                System.out.println(id);
                List<LianZha1>  list=LianZha1Biz.chaxun(id);
                apiResponse=new APIResponse(200,list,"成功");
                return apiResponse;
            }
              @GetMapping("/Inthequery")
             public APIResponse chaxun(){
                APIResponse  apiResponse = new APIResponse();

                List<LianZha1>  list=LianZha1Biz.Inthequery();
                apiResponse=new APIResponse(200,list,"成功");
                return apiResponse;
            }
            @GetMapping("/Inthequery1/{productname}")
            public APIResponse chaxun1(@PathVariable String productname){
                APIResponse  apiResponse = new APIResponse();

                List<LianZha1>  list=LianZha1Biz.Inthequery2(productname);
                apiResponse=new APIResponse(200,list,"成功");
                return apiResponse;
            }


}
