package org.java10.dzw.action.lyw;

import org.java10.dzw.biz.lyw.FirmnoBiz;
import org.java10.dzw.pojo.APIResponse;
import org.java10.dzw.pojo.Firmno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/persons/lyw/Firmnoaction")
public class Firmnoaction {

            @Autowired
            private FirmnoBiz FirmnoBiz;


            //查询全部厂商
            @GetMapping("/Firmnoaction1")
            public APIResponse  Firmnoaction(){
                APIResponse apiResponse = new APIResponse();
                List<Firmno> list =  FirmnoBiz.EnquiryofManufacturer();
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }

            //根据id来修改厂商状态
            @GetMapping("/Firmnoaction1/{id}")
            public APIResponse  Firmnoaction2(@PathVariable Integer id){
                APIResponse apiResponse = new APIResponse();
               Integer  list =  FirmnoBiz.EnquiryofManufacturer2(id);
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }
            //根据id来查询厂商
            @GetMapping("/Firmnoaction2/{id}")
            public APIResponse  Firmnoaction3(@PathVariable Integer id){
                APIResponse apiResponse = new APIResponse();
                List<Firmno>  list =  FirmnoBiz.EnquiryofManufacturer3(id);
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }

            //根据id来修改厂商
            @PostMapping("/basedontheID")
            public APIResponse  Firmnoaction4(@RequestBody Firmno firmno){
                APIResponse apiResponse = new APIResponse();

                Integer list =  FirmnoBiz.EnquiryofManufacturer4(firmno);
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }
            //根据id来修改厂商
            @PostMapping("/basedontheIDADD")
            public APIResponse  Firmnoaction5(@RequestBody Firmno firmno){
                APIResponse apiResponse = new APIResponse();
                firmno.setFirmnoCreator("lyw");
                firmno.setFirmnoDate(new Date());
                firmno.setFirmnoModifier("");
                firmno.setFirmnoUpdatetime(new Date());
                firmno.setFirmnoRemove(0);
                Integer list =  FirmnoBiz.EnquiryofManufacturer5(firmno);
                apiResponse=new APIResponse(200,list,"成功");
                return  apiResponse;
            }


}
