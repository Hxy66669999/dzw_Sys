package org.java10.dzw.dao.lyw;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.java10.dzw.vo.LianZha1;

import java.util.List;

public interface LianZha1Dao  extends BaseMapper<LianZha1> {

    @Select("SELECT shop.shop_id,shop.firmno_id,shop.shop_weight,shop.shop_price,commodity.commodity_name,commodity.commodity_id,shop.`shop_brand`,firmno.`firmno_name` " +
            "FROM goodstype,shop,commodity,`firmno` " +
            "WHERE goodstype.`goodsType_id`=shop.`goodsType_id` AND commodity.`commodity_id`=shop.`commodity_id`AND  state_id=0   AND  `firmno`.`firmno_id`=shop.`firmno_id`  AND " +
            "goodstype.`goodsType_id`= #{goodsType_id}")
    List<LianZha1>  LIST  (@Param("goodsType_id") Integer goodsTypeid);



    @Select("SELECT shop.shop_id,shop.firmno_id,shop.shop_weight,shop.shop_price,commodity.commodity_name,commodity.commodity_id,shop.`shop_brand`,firmno.`firmno_name` " +
            "FROM goodstype,shop,commodity,`firmno` " +
            "WHERE goodstype.`goodsType_id`=shop.`goodsType_id` AND commodity.`commodity_id`=shop.`commodity_id`  AND  `firmno`.`firmno_id`=shop.`firmno_id` AND   state_id=0   " )
    List<LianZha1>  list();

    @Select("<script>"+
            "SELECT shop.shop_id,shop.firmno_id,shop.shop_weight,shop.shop_price,commodity.commodity_name,commodity.commodity_id,shop.`shop_brand`,firmno.`firmno_name` " +
            "FROM goodstype,shop,commodity,`firmno` " +
            "<where>"+
            " goodstype.`goodsType_id`=shop.`goodsType_id` AND commodity.`commodity_id`=shop.`commodity_id`   AND  `firmno`.`firmno_id`=shop.`firmno_id`  AND  state_id=0 "+
             "	<if test='shop_brand !=null || shop_brand !=\"\"'> " +
                            " AND   shop.shop_brand  =#{shop_brand} "+
                " </if>"+
            "</where>"+
            "</script>" )
    List<LianZha1>  list1(@Param("shop_brand") String shopbrand);


}
