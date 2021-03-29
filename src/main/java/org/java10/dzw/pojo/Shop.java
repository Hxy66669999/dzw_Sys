package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("Shop")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class Shop {
    private static final long serialVersionUID = 1L;
        @TableId(type = IdType.AUTO,value="shop_id")
            private  Integer shopid;
        @TableField("firmno_id")
            private  String firmnoid;
    @TableField("state_id")
            private  Integer stateid;
    @TableField("goodsType_id")
            private  Integer goodsTypeid;
    @TableField("commodity_id")
            private  Integer commodityid;
    @TableField("shop_brand")
            private  String shopbrand;
    @TableField("shop_weight")
            private  Double shopweight;
    @TableField("shop_price")
            private  Double shopprice;
    @TableField("shop_bjmoney")
            private  Double shopbjmoney;
    @TableField("shop_hymoney")
            private  Double shophymoney;
    @TableField("shop_vipmoney")
            private  Double shopvipmoney;
    @TableField("shop_rxyprice")
            private  Double shoprxyprice;
    @TableField("shop_creator")
            private  String shopcreator;
    @TableField("shop_date")
            private  Date shopdate;
    @TableField("shop_modifier")
            private  String shopmodifier;
    @TableField("shope_updatetime")
            private  Date shopeupdatetime;
    @TableField("shop_remove")
            private  Integer shopremove;
    @TableField("shop_null_1")
            private  String shopnull_1;
    @TableField("shop_null_2")
            private  String shopnull_2;
    @TableField("shop_null_3")
            private  String shopnull_3;
    @TableField("shop_null_4")
            private  String shopnull_4;

    public Shop(Integer shopid, Integer stateid) {
        this.shopid = shopid;
        this.stateid = stateid;
    }

    public Shop(Integer shopid) {
        this.shopid = shopid;
    }

    public Shop(Integer shopid, String firmnoid, Integer stateid, Integer goodsTypeid, Integer commodityid, String shopbrand, Double shopweight, Double shopprice, Double shopbjmoney, Double shophymoney, Double shopvipmoney, Double shoprxyprice, String shopcreator, Date shopdate, String shopmodifier, Date shopeupdatetime, Integer shopremove) {
        this.shopid = shopid;
        this.firmnoid = firmnoid;
        this.stateid = stateid;
        this.goodsTypeid = goodsTypeid;
        this.commodityid = commodityid;
        this.shopbrand = shopbrand;
        this.shopweight = shopweight;
        this.shopprice = shopprice;
        this.shopbjmoney = shopbjmoney;
        this.shophymoney = shophymoney;
        this.shopvipmoney = shopvipmoney;
        this.shoprxyprice = shoprxyprice;
        this.shopcreator = shopcreator;
        this.shopdate = shopdate;
        this.shopmodifier = shopmodifier;
        this.shopeupdatetime = shopeupdatetime;
        this.shopremove = shopremove;
    }
}
