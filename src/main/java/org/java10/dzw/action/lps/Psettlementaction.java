package org.java10.dzw.action.lps;


import org.java10.dzw.biz.lps.psettlementbiz;
import org.java10.dzw.pojo.lps.psettlement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lps/pst")
public class Psettlementaction {

    @Autowired
    private psettlementbiz pstbiz;

    //新增订单维修项目
    @GetMapping("/save")
    public boolean save(psettlement pst){
        return pstbiz.save(pst);
    }

    //修改维修单价
}
