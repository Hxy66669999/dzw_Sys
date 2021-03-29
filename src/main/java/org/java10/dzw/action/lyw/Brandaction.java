package org.java10.dzw.action.lyw;

import org.java10.dzw.biz.lyw.BrandBiz1;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/api/persons/lyw/Brandaction")
public class Brandaction {


        @Autowired
        private BrandBiz1 BrandBiz;

        /**/
        @GetMapping("/Querybrand1")
        public  APIResponse  Querybrand1(){
            APIResponse apiResponse = new APIResponse();
            List<Brand> list =BrandBiz.Querybrand();
            apiResponse = new APIResponse(200,list,"成功");

            return  apiResponse;
        }

            @GetMapping("/condition/{name}")
            public APIResponse  condition(@PathVariable String name){

                APIResponse  apiResponse =  new APIResponse();
            List<Brand>  list  =BrandBiz.tiaojianchaxun(name);

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
                List<Brand>  list  = BrandBiz.chaxun(id);
                apiResponse=new APIResponse(200,list,"成功");
                return    apiResponse;
            }
           //新增品牌
        @PostMapping("/dzwbrandlyw")
            public  APIResponse  dzwbrandlyw(@RequestBody Brand brand){
                APIResponse apiResponse  =new APIResponse();
                brand.setBrandCreator("lyw");
                brand.setBrandDate(new Date());
                brand.setBrandModifier("");
                brand.setBrandUpdatetime(new Date());
                brand.setBrandRemove(0);
                Integer list  = BrandBiz.dzwbrandAdd(brand);
                apiResponse=new APIResponse(200,list,"成功");
                return    apiResponse;
        }
}
