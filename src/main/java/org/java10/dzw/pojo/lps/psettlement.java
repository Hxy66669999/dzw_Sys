package org.java10.dzw.pojo.lps;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("poject_settlement")
public class psettlement implements Serializable {
    @TableId(type = IdType.AUTO,value = "pst_id")
    private Integer id;
    @TableField("pst_ctime")
    private Date ctime;
    @TableField("pst_etime")
    private Date etime;
    @TableField("pst_price")
    private Double price;
    @TableField("pst_rework")
    private Integer rwork;
    @TableField("pst_completed")
    private Integer completed;

}
