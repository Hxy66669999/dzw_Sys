package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.Shop;

import org.java10.dzw.pojo.shop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopBiz  extends ServiceImpl<Shop, shop> {

    public Integer deleteomt(Integer id){
        QueryWrapper<shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().updateById(new shop(id,1));
        return  list;

    }
    public List<shop> deleteomt2(Integer id){
        QueryWrapper<shop> qw= Wrappers.query();
        qw.eq("shop_id",id);
        List<shop> list = super.getBaseMapper().selectList(qw);
        return  list;

    }

    public Integer xiugaishangpin(shop shop){
        QueryWrapper<shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().updateById(new shop(shop.getShopid(),
                                                                shop.getFirmnoid(),
                                                                shop.getStateid(),
                                                                shop.getGoodsTypeid(),
                                                                shop.getCommodityid(),
                                                                shop.getShopbrand(),
                                                                shop.getShopweight(),
                                                                shop.getShopprice(),
                                                                shop.getShopbjmoney(),
                                                                shop.getShophymoney(),
                                                                shop.getShopvipmoney(),
                                                                shop.getShoprxyprice(),
                                                                shop.getShopcreator(),
                                                                shop.getShopdate(),
                                                                shop.getShopmodifier(),
                                                                shop.getShopeupdatetime(),
                                                                shop.getShopremove()));
        return  list;
    }
    public Integer xinzeng(shop shop){
        QueryWrapper<shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().insert(new shop(shop.getShopid(),
                shop.getFirmnoid(),
                shop.getStateid(),
                shop.getGoodsTypeid(),
                shop.getCommodityid(),
                shop.getShopbrand(),
                shop.getShopweight(),
                shop.getShopprice(),
                shop.getShopbjmoney(),
                shop.getShophymoney(),
                shop.getShopvipmoney(),
                shop.getShoprxyprice(),
                shop.getShopcreator(),
                shop.getShopdate(),
                shop.getShopmodifier(),
                shop.getShopeupdatetime(),
                shop.getShopremove()));
        return  list;
    }

}
