package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.BrandDao;
import org.java10.dzw.pojo.brand;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandBiz extends ServiceImpl<BrandDao,brand> {

                public List<brand>  Querybrand(){
                    QueryWrapper<brand> qw= Wrappers.query();
                    qw.eq("brand_remove",0);
                    List<brand>  list  = super.baseMapper.selectList(qw);
                    return   list;
                }


                public List<brand>  tiaojianchaxun(String name){
                    QueryWrapper<brand> qw= Wrappers.query();
                    qw.eq("brand_name",name);
                    List<brand>  list  = super.baseMapper.selectList(qw);
                    return  list;
                }
                //删除
                 public  Integer  Deletebrand(Integer id){
                     QueryWrapper<brand> qw= Wrappers.query();
                     qw.eq("brand_id",id);
                     Integer  list = super.baseMapper.update(new brand(1),qw);

                        return  list;
                 }

                 public  List<brand>  chaxun(Integer id){
                     QueryWrapper<brand> qw= Wrappers.query();
                    qw.eq("brand_id",id);
                    List<brand>   list =  super.baseMapper.selectList(qw);

                    return list;
                 }

                 public Integer dzwbrandAdd(brand brand){
                     QueryWrapper<brand> qw= Wrappers.query();
                     Integer list  = super.baseMapper.insert(new brand(brand.getBrandname(),brand.getBrandcreator(),brand.getBranddate(),brand.getBrandmodifier(),brand.getBrandupdatetime(),brand.getBrandremove()));

                    return  list;
                 }

}
