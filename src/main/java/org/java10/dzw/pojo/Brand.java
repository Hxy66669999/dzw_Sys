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
@NoArgsConstructor
@AllArgsConstructor
@TableName("brand")
public class Brand {
    @TableId(value = "brand_id",type = IdType.AUTO)
    private Integer brandId;

    @TableField("brand_name")
    private String brandName;

    @TableField("brand_creator")
    private String brandCreator;

    @TableField("brand_date")
    private Date brandDate;

    @TableField("brand_modifier")
    private String brandModifier;

    @TableField("brand_updatetime")
    private Date brandUpdatetime;

    @TableField("brand_remove")
    private Integer brandRemove;

    @TableField("brand_null_1")
    private String brandNull1;

    @TableField("brand_null_2")
    private String brandNull2;

    @TableField("brand_null_3")
    private String brandNull3;

    @TableField("brand_null_4")
    private String brandNull4;


}