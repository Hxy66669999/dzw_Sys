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
@TableName("vehicledatainfo")
public class Vehicledatainfo implements Serializable {

    @TableId(value = "vdf_id",type = IdType.AUTO)
    private Integer vdfId;

    @TableField("vdf_brand")
    private Integer vdfBrand;

    @TableField("vdf_type")
    private Integer vdfType;

    @TableField("vdf_place")
    private String vdfPlace;

    @TableField("vdf_color")
    private String vdfColor;

    @TableField("vdf_platenum")
    private String vdfPlatenum;

    @TableField("vdf_vin")
    private String vdfVin;

    @TableField("vdf_reserve")
    private String vdfReserve;

    @TableField("vdf_cdfnum")
    private String vdfCdfnum;

    @TableField("vdf_reserve2")
    private Integer vdfReserve2;

    @TableField("vdf_reserve3")
    private String vdfReserve3;

    @TableField("vdf_reserve4")
    private String vdfReserve4;

    @TableField("vdf_reserve5")
    private String vdfReserve5;

    @TableField("vdf_creator")
    private String vdfCreator;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @TableField("vdf_date")
    private Date vdfDate;

    @TableField("vdf_modifier")
    private String vdfModifier;

    @TableField("vdf_updatetime")
    private Date vdfUpdatetime;

    @TableField("vdf_remove")
    private Integer vdfRemove;

    }