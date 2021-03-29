package org.java10.dzw.biz.Hxy;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.Hxy.VipconsumeinfoMapper;
import org.java10.dzw.pojo.Vipconsumeinfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VipconsumeinfoBiz extends ServiceImpl<VipconsumeinfoMapper, Vipconsumeinfo> {

    /**
     * 新增VIP消费记录
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int addVIPconsumeinfo(Vipconsumeinfo vipconsumeinfo){
        return  super.getBaseMapper().insert(vipconsumeinfo);
    }
}
