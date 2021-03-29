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

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("clientdatainfo")
public class Clientdatainfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "cdf_number",type = IdType.INPUT)
    private String cdfNumber;

    @TableField("cdf_name")
    private String cdfName;

    @TableField("cdf_address")
    private String cdfAddress;

    @TableField("cdf_phone")
    private String cdfPhone;

    @TableField("cdf_sex")
    private Integer cdfSex;

    @TableField("cdf_isvip")
    private Integer cdfIsvip;

    @TableField("cdf_vipaccount")
    private String cdfVipaccount;

    @TableField("cdf_vippass")
    private String cdfVippass;

    @TableField("cdf_vipmoney")
    private Float cdfVipmoney;

    @TableField("cdf_vipfen")
    private Integer cdfVipfen;


    private String cdfReserve;

    private Integer cdfReserve2;

    private String cdfReserve3;

    private String cdfReserve4;

    private String cdfReserve5;

    @TableField("cdf_creator")
    private String cdfCreator;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @TableField("cdf_date")
    private Date cdfDate;

    @TableField("cdf_modifier")
    private String cdfModifier;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @TableField("cdf_updatetime")
    private Date cdfUpdatetime;

    @TableField("cdf_remove")
    private Integer cdfRemove;

    @Override
    public String toString() {
        return "Clientdatainfo{" +
                "cdfNumber='" + cdfNumber + '\'' +
                ", cdfName='" + cdfName + '\'' +
                ", cdfAddress='" + cdfAddress + '\'' +
                ", cdfPhone='" + cdfPhone + '\'' +
                ", cdfSex=" + cdfSex +
                ", cdfIsvip=" + cdfIsvip +
                ", cdfVipaccount='" + cdfVipaccount + '\'' +
                ", cdfVippass='" + cdfVippass + '\'' +
                ", cdfVipmoney=" + cdfVipmoney +
                ", cdfVipfen=" + cdfVipfen +
                ", cdfReserve='" + cdfReserve + '\'' +
                ", cdfReserve2=" + cdfReserve2 +
                ", cdfReserve3='" + cdfReserve3 + '\'' +
                ", cdfReserve4='" + cdfReserve4 + '\'' +
                ", cdfReserve5='" + cdfReserve5 + '\'' +
                ", cdfCreator='" + cdfCreator + '\'' +
                ", cdfDate=" + cdfDate +
                ", cdfModifier='" + cdfModifier + '\'' +
                ", cdfUpdatetime=" + cdfUpdatetime +
                ", cdfRemove=" + cdfRemove +
                '}';
    }
}