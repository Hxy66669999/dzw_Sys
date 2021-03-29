package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("modeltype")
public class Modeltype {

    @TableId(value = "modeltype_id",type = IdType.AUTO)
    private Integer modeltypeId;

    @TableField("engine_id")
    private Integer engineId;

    @TableField("vehicle_id")
    private Integer vehicleId;

    @TableField("modeltype_name")
    private String modeltypeName;

    @TableField("modeltype_price")
    private Double modeltypePrice;

    @TableField("modeltype_creator")
    private String modeltypeCreator;

    @TableField("modeltype_date")
    private Date modeltypeDate;

    @TableField("modeltype_modifier")
    private String modeltypeModifier;

    @TableField("modeltype_updatetime")
    private Date modeltypeUpdatetime;

    @TableField("modeltype_remove")
    private Integer modeltypeRemove;

    @TableField("modeltype_null_1")
    private String modeltypeNull1;

    @TableField("modeltype_null_2")
    private String modeltypeNull2;

    @TableField("modeltype_null_3")
    private String modeltypeNull3;

    @TableField("modeltype_null_4")
    private String modeltypeNull4;


}