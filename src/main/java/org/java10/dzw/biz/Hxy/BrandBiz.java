package org.java10.dzw.biz.Hxy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.Hxy.BrandMapper;
import org.java10.dzw.pojo.Brand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandBiz extends ServiceImpl<BrandMapper, Brand> {

    /**
     * 查询车品牌
     */
    @Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public List<Brand> queryCatBrand(){
        QueryWrapper qw  = Wrappers.query();
        qw.eq("brand_remove",0);
        return super.getBaseMapper().selectList(qw);
    }
}
