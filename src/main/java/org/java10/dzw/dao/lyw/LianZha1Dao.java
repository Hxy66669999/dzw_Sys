package org.java10.dzw.dao.lyw;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.java10.dzw.vo.LianZha1;

import java.util.List;

public interface LianZha1Dao  extends BaseMapper<LianZha1> {

    @Select("SELECT Shop.shop_id,Shop.firmno_id,Shop.shop_weight,Shop.shop_price,Commodity.commodity_name,Commodity.commodity_id,Shop.`shop_brand`,FirmnoDao.`firmno_name` " +
            "FROM Goodstype,Shop,Commodity,`FirmnoDao` " +
            "WHERE Goodstype.`goodsType_id`=Shop.`goodsType_id` AND Commodity.`commodity_id`=Shop.`commodity_id`AND  state_id=0   AND  `FirmnoDao`.`firmno_id`=Shop.`firmno_id`  AND " +
            "Goodstype.`goodsType_id`= #{goodsType_id}")
    List<LianZha1>  LIST  (@Param("goodsType_id") Integer goodsTypeid);



    @Select("SELECT Shop.shop_id,Shop.firmno_id,Shop.shop_weight,Shop.shop_price,Commodity.commodity_name,Commodity.commodity_id,Shop.`shop_brand`,FirmnoDao.`firmno_name` " +
            "FROM Goodstype,Shop,Commodity,`FirmnoDao` " +
            "WHERE Goodstype.`goodsType_id`=Shop.`goodsType_id` AND Commodity.`commodity_id`=Shop.`commodity_id`  AND  `FirmnoDao`.`firmno_id`=Shop.`firmno_id` AND   state_id=0   " )
    List<LianZha1>  list();

    @Select("<script>"+
            "SELECT Shop.shop_id,Shop.firmno_id,Shop.shop_weight,Shop.shop_price,Commodity.commodity_name,Commodity.commodity_id,Shop.`shop_brand`,FirmnoDao.`firmno_name` " +
            "FROM Goodstype,Shop,Commodity,`FirmnoDao` " +
            "<where>"+
            " Goodstype.`goodsType_id`=Shop.`goodsType_id` AND Commodity.`commodity_id`=Shop.`commodity_id`   AND  `FirmnoDao`.`firmno_id`=Shop.`firmno_id`  AND  state_id=0 "+
             "	<if test='shop_brand !=null || shop_brand !=\"\"'> " +
                            " AND   Shop.shop_brand  =#{shop_brand} "+
                " </if>"+
            "</where>"+
            "</script>" )
    List<LianZha1>  list1(@Param("shop_brand") String shopbrand);


}
