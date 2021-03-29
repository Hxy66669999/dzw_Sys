package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("commodity")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class commodity {

    @TableId(type = IdType.ASSIGN_ID,value="commodity_id")
    private  Integer    commodityid;
    @TableField("commodity_name")
    private String        commodityname;
    @TableField("commodity_creator")
    private String        commoditycreator;
    @TableField("commodity_date")
    private Date          commoditydate;
    @TableField("commodity_modifier")
    private String        commoditymodifier;
    @TableField("commodity_updatetime")
    private Date          commodityupdatetime;
    @TableField("commodity_remove")
    private Integer       commodityremove;
    @TableField("commodity_null_1")
    private String        commoditynull_1;
    @TableField("commodity_null_2")
    private String        commoditynull_2;
    @TableField("commodity_null_3")
    private String        commoditynull_3;
    @TableField("commodity_null_4")
    private String        commoditynull_4;

}
