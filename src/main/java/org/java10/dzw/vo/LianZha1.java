package org.java10.dzw.vo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("Goodstype")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class LianZha1 {

        private static final long serialVersionUID = 1L;
        @TableId(type = IdType.ASSIGN_ID,value="shop_id")
        private  Integer  shopid;
        @TableField("firmno_id")
        private  String firmnoid;
        @TableField("shop_weight")
        private  Double shopweight;
        @TableField("shop_price")
        private  Double shopprice;
        @TableField("commodity_name")
        private String commodityname;
        @TableField("commodity_id")
        private Integer commodityid;
        @TableField("shop_brand")
        private String shopbrand;
        @TableField("shop_remove")
        private  Integer shopremove;
        @TableField("firmno_name")
        private  String firmnoname;

}
