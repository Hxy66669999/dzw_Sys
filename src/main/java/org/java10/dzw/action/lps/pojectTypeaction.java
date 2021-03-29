package org.java10.dzw.action.lps;


import org.java10.dzw.biz.lps.pojectTypebiz;
import org.java10.dzw.pojo.lps.pojectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lps/pt")
public class pojectTypeaction {

    @Autowired
    private pojectTypebiz pctbiz;


    //查询项目类型
    @GetMapping("/findpct")
    public List<pojectType> findpct(){
        return pctbiz.list();
    }

    //新增项目类型
    @GetMapping("/save")
    public boolean savepoj(pojectType pt){
        return pctbiz.save(pt);
    }
}
