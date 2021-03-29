package org.java10.dzw.pojo.lps;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("poject")
@AllArgsConstructor
@NoArgsConstructor
public class poject implements Serializable {

    @TableId(type = IdType.AUTO,value = "pc_id")
    private Integer id;
    @TableField(value = "pct_id")
    private Integer pctid;
    @TableField(value = "pc_num")
    private Integer num;
    @TableField(value = "pc_name")
    private String name;
    @TableField(value = "pc_time")
    private Integer time;
    @TableField(value = "pc_price")
    private Double price;
    @TableField(value = "pc_creator")
    private String creator;
    @TableField(value = "pc_date")
    private Date date;
    @TableField(value = "pc_modlifier")
    private String modlifier;
    @TableField(value = "pc_updetime")
    private Date updetime;
    @TableField(value = "pc_remove")
    private Integer remove;
}
