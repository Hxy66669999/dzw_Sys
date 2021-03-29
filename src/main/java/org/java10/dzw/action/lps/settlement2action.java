package org.java10.dzw.action.lps;


import org.java10.dzw.biz.lps.settlement2biz;
import org.java10.dzw.pojo.lps.settlement2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lps/set2")
public class settlement2action {

    @Autowired
    private settlement2biz setbiz;

    //新增结算信息
    @GetMapping("/save")
    public boolean insertNew(settlement2 set){
        return setbiz.save(set);
    }

    //提交结算信息
    @GetMapping("/update")
    public boolean updatejudge(settlement2 set2){
        return setbiz.updateById(set2);
    }
}
