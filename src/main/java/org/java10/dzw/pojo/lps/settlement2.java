package org.java10.dzw.pojo.lps;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("settlement2")
public class settlement2 implements Serializable {
    @TableId(type = IdType.AUTO,value = "ste_id")
    private Integer id;
    @TableField("ste_vipid")
    private Integer vipid;
    @TableField("ste_judge")
    private Integer judge;
    @TableField("ste_pick")
    private Integer pick;
    @TableField("ste_carid")
    private Integer carid;
    @TableField("ste_carprice")
    private Double price;
    @TableField("ste_mileage")
    private Double mileage;
}
