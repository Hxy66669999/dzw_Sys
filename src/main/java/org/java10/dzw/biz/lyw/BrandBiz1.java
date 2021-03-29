package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.BrandDao;
import org.java10.dzw.pojo.Brand;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandBiz1 extends ServiceImpl<BrandDao, Brand> {

                public List<Brand>  Querybrand(){
                    QueryWrapper<Brand> qw= Wrappers.query();
                    qw.eq("brand_remove",0);
                    List<Brand>  list  = super.baseMapper.selectList(qw);
                    return   list;
                }


                public List<Brand>  tiaojianchaxun(String name){
                    QueryWrapper<Brand> qw= Wrappers.query();
                    qw.eq("brand_name",name);
                    List<Brand>  list  = super.baseMapper.selectList(qw);
                    return  list;
                }
                //删除
                 public  Integer  Deletebrand(Integer id){
                     QueryWrapper<Brand> qw= Wrappers.query();
                     qw.eq("brand_id",id);
                     Integer  list = super.baseMapper.update(new Brand(1),qw);

                        return  list;
                 }

                 public  List<Brand>  chaxun(Integer id){
                     QueryWrapper<Brand> qw= Wrappers.query();
                    qw.eq("brand_id",id);
                    List<Brand>   list =  super.baseMapper.selectList(qw);

                    return list;
                 }

                 public Integer dzwbrandAdd(Brand brand){
                     QueryWrapper<Brand> qw= Wrappers.query();
                     Integer list  = super.baseMapper.insert(new Brand(brand.getBrandName(),brand.getBrandCreator(),brand.getBrandDate(),brand.getBrandModifier(),brand.getBrandUpdatetime(),brand.getBrandRemove()));

                    return  list;
                 }

}
