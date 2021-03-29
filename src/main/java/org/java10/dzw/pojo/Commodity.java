package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("Commodity")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class Commodity {

    @TableId(type = IdType.ASSIGN_ID,value="commodity_id")
    private  Integer    commodityId;
    @TableField("commodity_name")
    private String        commodityName;
    @TableField("commodity_creator")
    private String        commodityCreator;
    @TableField("commodity_date")
    private Date          commodityDate;
    @TableField("commodity_modifier")
    private String        commodityModifier;
    @TableField("commodity_updatetime")
    private Date          commodityUpdatetime;
    @TableField("commodity_remove")
    private Integer       commodityRemove;
    @TableField("commodity_null_1")
    private String        commodityNull_1;
    @TableField("commodity_null_2")
    private String        commodityNull_2;
    @TableField("commodity_null_3")
    private String        commodityNull_3;
    @TableField("commodity_null_4")
    private String        commodityNull_4;

}
