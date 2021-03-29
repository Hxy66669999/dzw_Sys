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
@TableName("poject_type")
public class pojectType implements Serializable {
    @TableId(type = IdType.AUTO,value = "pct_id")
    private Integer id;
    @TableField(value = "pct_name")
    private String name;
}
