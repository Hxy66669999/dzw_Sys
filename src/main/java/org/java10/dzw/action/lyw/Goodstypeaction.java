package org.java10.dzw.action.lyw;

import org.java10.dzw.biz.lyw.GoodstypeBiz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.goodstype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons/lyw")
public class Goodstypeaction {

        @Autowired
        private GoodstypeBiz goodstypeBiz;

        @GetMapping("/Inquirecommoditytype")
        public APIResponse  chaxun1(){
                List<goodstype>  oo =  goodstypeBiz.chaxun();
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }

        @GetMapping("/Inquirecommoditytype/{pass}")
        public APIResponse  Thenewtype1(@PathVariable String pass){
                System.out.println(pass);
                Integer  oo =  goodstypeBiz.Thenewtype(pass);
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }
        /*根据id来修改类别名称*/
        @GetMapping("/Typesofchanges/{id}/{pass}")
        public APIResponse  Typesofchanges(@PathVariable Integer id,@PathVariable String pass){
                System.out.println(id+""+pass);
                Integer  oo =  goodstypeBiz.Typesofchanges(id,pass);
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }


        //根据id来查询类别
        @GetMapping("/Typesofchanges1/{id}")
        public APIResponse  Idlaiquery(@PathVariable Integer id){
                System.out.println(id);

                List<goodstype>  oo =  goodstypeBiz.Idlaiquery(id);
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }
        //根据类别名称来查询
        @GetMapping("/search/{goodsTypename}")
        public APIResponse  search(@PathVariable String goodsTypename){
                System.out.println(goodsTypename);

                List<goodstype>  oo =  goodstypeBiz.search(goodsTypename);
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }

        //根据类型id来修改删除状态id
        @GetMapping("/delete/{id}")
        public APIResponse  delete(@PathVariable Integer id){
                System.out.println(id+"hhhh");

                 Integer  oo =  goodstypeBiz.delete1(id);
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }
        //商品修改里面的查询商品品牌
        @GetMapping("/Query")
        public APIResponse Query(){
                List<goodstype>  oo =  goodstypeBiz.chaxun();
                APIResponse  apiResponse = new APIResponse();
                apiResponse=new APIResponse(200,oo,"成功");
                return  apiResponse;
        }

}
