package org.java10.dzw.action.lps;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.java10.dzw.biz.lps.pojectbiz;
import org.java10.dzw.pojo.lps.poject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lps/pe")
public class pojectaction {

    @Autowired
    private pojectbiz pbiz;

    //查询维修项目
    @GetMapping("/findp")
    public List<poject> findAll(){
        return pbiz.list();
    }


    //新增维修项目
    @GetMapping("/savep")
    public boolean saveNew(poject p){
        return pbiz.save(p);
    }
}
