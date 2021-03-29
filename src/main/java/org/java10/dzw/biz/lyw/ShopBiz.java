package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.ShopDao;

import org.java10.dzw.pojo.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopBiz  extends ServiceImpl<ShopDao, Shop> {

    public Integer deleteomt(Integer id){
        QueryWrapper<Shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().updateById(new Shop(id,1));
        return  list;

    }
    public List<Shop> deleteomt2(Integer id){
        QueryWrapper<Shop> qw= Wrappers.query();
        qw.eq("shop_id",id);
        List<Shop> list = super.getBaseMapper().selectList(qw);
        return  list;

    }

    public Integer xiugaishangpin(Shop shop){
        QueryWrapper<Shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().updateById(new Shop(shop.getShopid(),
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
    public Integer xinzeng(Shop shop){
        QueryWrapper<Shop> qw= Wrappers.query();
        Integer list = super.getBaseMapper().insert(new Shop(shop.getShopid(),
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
