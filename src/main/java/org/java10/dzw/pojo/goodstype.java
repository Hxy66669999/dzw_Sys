package org.java10.dzw.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("goodstype")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class goodstype {

    private static final long serialVersionUID = 1L;
            @TableId(type = IdType.AUTO,value="goodsType_id")
            private Integer goodsTypeid;
            @TableField("goodsType_name")
            private String  goodsTypename;
             @TableField("goodsType_creator")
            private String  goodsTypecreator;
             @TableField("goodsType_date")
            private Date  goodsTypedate;
             @TableField("goodsType_modifier")
            private  String goodsTypemodifier;
             @TableField("goodsType_updatetime")
             @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//前端转到后端
             @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//后端转到前端
            private Date   goodsTypeupdatetime;
            @TableField("goodsType_remove")
            private  Integer goodsTyperemove;
    @TableField("goodsType_null_1")
            private String goodsTypenull1;
    @TableField("goodsType_null_2")
            private  String goodsTypenull2;
    @TableField("goodsType_null_3")
            private  String goodsTypenull3;
    @TableField("goodsType_null_4")
            private  String goodsTypenull4;



    @Override
    public String toString() {
        return "goodstype{" +
                "goodsTypeid=" + goodsTypeid +
                ", goodsTypename='" + goodsTypename + '\'' +
                ", goodsTypecreator='" + goodsTypecreator + '\'' +
                ", goodsTypedate=" + goodsTypedate +
                ", goodsTypemodifier='" + goodsTypemodifier + '\'' +
                ", goodsTypeupdatetime=" + goodsTypeupdatetime +
                ", goodsTyperemove=" + goodsTyperemove +
                ", goodsTypenull1='" + goodsTypenull1 + '\'' +
                ", goodsTypenull2='" + goodsTypenull2 + '\'' +
                ", goodsTypenull3='" + goodsTypenull3 + '\'' +
                ", goodsTypenull4='" + goodsTypenull4 + '\'' +
                '}';
    }

    public goodstype(String goodsTypename, String goodsTypecreator, Date goodsTypedate, String goodsTypemodifier, Date goodsTypeupdatetime, Integer goodsTyperemove) {
        this.goodsTypename = goodsTypename;
        this.goodsTypecreator = goodsTypecreator;
        this.goodsTypedate = goodsTypedate;
        this.goodsTypemodifier = goodsTypemodifier;
        this.goodsTypeupdatetime = goodsTypeupdatetime;
        this.goodsTyperemove = goodsTyperemove;
    }

    public goodstype(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }

    public goodstype(Integer goodsTypeid, String goodsTypename) {
        this.goodsTypeid = goodsTypeid;
        this.goodsTypename = goodsTypename;
    }

    public goodstype(Integer goodsTypeid, Integer goodsTyperemove) {
        this.goodsTypeid = goodsTypeid;
        this.goodsTyperemove = goodsTyperemove;
    }
}
