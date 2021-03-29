package org.java10.dzw.biz.Hxy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.Hxy.ModeltypeMapper;
import org.java10.dzw.pojo.Modeltype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeltypeBiz extends ServiceImpl<ModeltypeMapper, Modeltype> {
    /**
     * 根据品牌查询车型
     */
    public List<Modeltype> queryCatType(Integer vehicleId){
        QueryWrapper qw = Wrappers.query();
        qw.eq("vehicle_id",vehicleId);
        return super.list(qw);
    }
}
