package org.java10.dzw.biz.Hxy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.java10.dzw.dao.Hxy.ClientdatainfoMapper;
import org.java10.dzw.pojo.Clientdatainfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientdatainfoBiz extends ServiceImpl<ClientdatainfoMapper, Clientdatainfo> {

    /**
     * 查询所有客户资料
     */
    @Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public PageInfo<Clientdatainfo> clientdataQueryAll(String cdfName){
        QueryWrapper qw = Wrappers.query();
        qw.eq("cdf_remove",0);
        qw.like("cdf_name",cdfName);
        qw.orderByDesc("cdf_date");
        return new PageInfo<Clientdatainfo>(super.getBaseMapper().selectList(qw));
    }

    /**
     * 新增客户
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int addClientdata(Clientdatainfo clientdatainfo){
        return super.getBaseMapper().insert(clientdatainfo);
    }

    /**
     * 根据编号查询
     */
    @Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public Clientdatainfo queryByNum(String cdfNumber){
        return super.getBaseMapper().selectById(cdfNumber);
    }

    /**
     * 修改客户资料
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateClientDataByNum(Clientdatainfo clientdatainfo){
        UpdateWrapper uw = Wrappers.update();
        uw.eq("cdf_remove",0);
        uw.eq("cdf_number",clientdatainfo.getCdfNumber());
        return super.getBaseMapper().update(clientdatainfo,uw);
    }

}
