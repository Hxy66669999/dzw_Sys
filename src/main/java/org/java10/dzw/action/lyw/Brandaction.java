package org.java10.dzw.action.lyw;

import org.java10.dzw.biz.lyw.BrandBiz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/api/persons/lyw/Brandaction")
public class Brandaction {


        @Autowired
        private BrandBiz BrandBiz;

        /**/
        @GetMapping("/Querybrand1")
        public  APIResponse  Querybrand1(){
            APIResponse apiResponse = new APIResponse();
            List<brand>  list =BrandBiz.Querybrand();
            apiResponse = new APIResponse(200,list,"成功");

            return  apiResponse;
        }

            @GetMapping("/condition/{name}")
            public APIResponse  condition(@PathVariable String name){

                APIResponse  apiResponse =  new APIResponse();
            List<brand>  list  =BrandBiz.tiaojianchaxun(name);

                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
        }

        /*修改状态*/
            @GetMapping("/coDeletebrand/{id}")
            public APIResponse  Deletebrand(@PathVariable Integer id){
                APIResponse  apiResponse =  new APIResponse();
                Integer  list  =BrandBiz.Deletebrand(id);
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }
            /*修改查询*/
            @GetMapping("/trademark/{id}")
            public  APIResponse    trademark(@PathVariable Integer id){
                APIResponse  apiResponse =  new APIResponse();
                List<brand>  list  = BrandBiz.chaxun(id);
                apiResponse=new APIResponse(200,list,"成功");
                return    apiResponse;
            }
           //新增品牌
        @PostMapping("/dzwbrandlyw")
            public  APIResponse  dzwbrandlyw(@RequestBody brand brand){
                APIResponse apiResponse  =new APIResponse();
                brand.setBrandcreator("lyw");
                brand.setBranddate(new Date());
                brand.setBrandmodifier("");
                brand.setBrandupdatetime(new Date());
                brand.setBrandremove(0);
                Integer list  = BrandBiz.dzwbrandAdd(brand);
                apiResponse=new APIResponse(200,list,"成功");
                return    apiResponse;
        }
}
