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

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("vipconsumeinfo")
public class Vipconsumeinfo {
    @TableId(value = "vipci_id",type = IdType.AUTO)
    private Integer vipciId;

    @TableField("vipci_account")
    private String vipciAccount;

    @TableField("vipci_name")
    private String vipciName;

    @TableField("vipci_ordermun")
    private String vipciOrdermun;

    @TableField("vipci_ordermoeny")
    private Float vipciOrdermoeny;

    @TableField("vipci_xftype")
    private String vipciXftype;

    @TableField("vipci_upmoeny")
    private Float vipciUpmoeny;

    @TableField("vipci_fktype")
    private String vipciFktype;

    @TableField("vipci_reserve")
    private String vipciReserve;

    @TableField("vipci_reserve2")
    private Integer vipciReserve2;

    @TableField("vipci_reserve3")
    private String vipciReserve3;

    @TableField("vipci_reserve4")
    private String vipciReserve4;

    @TableField("vipci_reserve5")
    private String vipciReserve5;

    @TableField("vipci_creator")
    private String vipciCreator;

    @JsonFormat(pattern = "yyyy-DD-mm",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-DD-mm")
    @TableField("vipci_date")
    private Date vipciDate;

    @TableField("vipci_modifier")
    private String vipciModifier;

    @JsonFormat(pattern = "yyyy-DD-mm",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-DD-mm")
    @TableField("vipci_updatetime")
    private Date vipciUpdatetime;

    @TableField("vipci_remove")
    private Integer vipciRemove;


}