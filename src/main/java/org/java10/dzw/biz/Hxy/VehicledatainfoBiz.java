package org.java10.dzw.biz.Hxy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java10.dzw.dao.Hxy.BrandMapper;
import org.java10.dzw.dao.Hxy.ModeltypeMapper;
import org.java10.dzw.dao.Hxy.VehicledatainfoMapper;
import org.java10.dzw.pojo.Brand;
import org.java10.dzw.pojo.Modeltype;
import org.java10.dzw.pojo.Vehicledatainfo;
import org.java10.dzw.vo.CatClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicledatainfoBiz extends ServiceImpl<VehicledatainfoMapper, Vehicledatainfo> {

    //车型
    @Autowired
    private ModeltypeMapper modeltypeMapper;
    @Autowired
    //品牌
    private BrandMapper brandMapper;

    /**
     * 查询客户车辆信息
     */
    @Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public List<CatClientVo> queryByClientCat(String vdfCdfnum){
        //车视图的集合
        List<CatClientVo> volist = new ArrayList<CatClientVo>();
        QueryWrapper qw = Wrappers.query();
        qw.eq("vdf_remove",0);
        qw.eq("vdf_cdfnum",vdfCdfnum);
        List<Vehicledatainfo> vehic = super.getBaseMapper().selectList(qw);
        for (Vehicledatainfo cat : vehic){
          Modeltype modeltype = modeltypeMapper.selectById(cat.getVdfType());
           Brand brand = brandMapper.selectById(cat.getVdfBrand());
            volist.add( new CatClientVo(brand.getBrandName(),modeltype.getModeltypeName(),cat));
        }
        return volist;
    }

    /**
     * 新增客户车辆
     * @param vehicledatainfo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int addClientCat(Vehicledatainfo vehicledatainfo){
        return super.getBaseMapper().insert(vehicledatainfo);
    }

    /**
     * 查询全部车辆
     */
    @Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
    public PageInfo queryCatAll(String vdfPlatenum,Integer pageNum, Integer pageSize){
        //车视图集合
        PageHelper.startPage(pageNum,pageSize);
        List<CatClientVo> voList = new ArrayList<>();
        QueryWrapper qw = Wrappers.query();
        qw.eq("vdf_remove",0);
        qw.like("vdf_platenum",vdfPlatenum);
        qw.orderByDesc("vdf_creator");
        //查询所有车辆

        List<Vehicledatainfo> catLists = super.getBaseMapper().selectList(qw);
        PageInfo vehicledatainfoPageInfo = new PageInfo<>(catLists);
        System.out.println(catLists.size());
//        vdfPlatenum = vdfPlatenum == ""?null:"%"+vdfPlatenum+"%";
//        List<Vehicledatainfo> catLists = super.getBaseMapper().queryAllCat(vdfPlatenum);
        //循环给车视图赋值
        for (Vehicledatainfo cat : catLists){
            Brand brand = brandMapper.selectById(cat.getVdfBrand());
            Modeltype modeltype = modeltypeMapper.selectById(cat.getVdfType());
            voList.add( new CatClientVo(brand.getBrandName(),modeltype.getModeltypeName(),cat));
        }
        vehicledatainfoPageInfo.setList(voList);
        return vehicledatainfoPageInfo;
    }


}
