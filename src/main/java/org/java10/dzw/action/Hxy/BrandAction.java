package org.java10.dzw.action.Hxy;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.biz.Hxy.BrandBiz;
import org.java10.dzw.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Hxy/BrandAction")
public class BrandAction  {

    @Autowired
    private BrandBiz brandBiz;

    /**
     * 查询车品牌
     */
    @GetMapping("/queryCatBrand")
    public List<Brand> queryCatBrand(){
        return brandBiz.queryCatBrand();
    }
}
