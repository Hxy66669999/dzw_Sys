package org.java10.dzw.action.Hxy;

import org.java10.dzw.biz.Hxy.ModeltypeBiz;
import org.java10.dzw.pojo.Modeltype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Hxy/ModeltypeAction")
public class ModeltypeAction {
    @Autowired
    private ModeltypeBiz modeltypeBiz;

    /**
     * 根据品牌查询车型
     */
    @GetMapping("/queryCatType")
    public List<Modeltype> queryCatType(Integer vehicleId){
        return  modeltypeBiz.queryCatType(vehicleId);
    }
}
