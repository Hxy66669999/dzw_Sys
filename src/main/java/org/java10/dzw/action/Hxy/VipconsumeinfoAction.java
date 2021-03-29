package org.java10.dzw.action.Hxy;

import org.java10.dzw.biz.Hxy.VipconsumeinfoBiz;
import org.java10.dzw.pojo.Vipconsumeinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/Hxy/VipconsumeinfoAction")
public class VipconsumeinfoAction {
    @Autowired
    private VipconsumeinfoBiz vipconsumeinfoBiz;

    /**
     * 新增VIP消费记录
     */
    @PostMapping("/addVIPconsumeinfo")
    public Map<String,Object> addVIPconsumeinfo(@RequestBody  Vipconsumeinfo vipconsumeinfo){
        Map<String,Object> map = new HashMap<>();
        Integer num = vipconsumeinfoBiz.addVIPconsumeinfo(vipconsumeinfo);
        if (num > 0){
            map.put("code",200);
            map.put("msg","新增成功！");
        }else {
            map.put("code",500);
            map.put("msg","新增失败！");
        }
        return map;
    }
}
