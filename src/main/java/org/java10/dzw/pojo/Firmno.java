package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("FirmnoDao")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class Firmno {

    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO,value="firmno_id")
            private String          firmnoId;
    @TableField("firmno_name")
            private String          firmnoName;
    @TableField("firmno_address")
            private String          firmnoAddress;
    @TableField("firmno_phone")
            private String          firmnoPhone;
    @TableField("firmno_lxr")
            private String            firmnoLxr;
    @TableField("firmno_lxrphone")
            private String          firmnoLxrphone;
    @TableField("firmno_firmsevenst")
            private String          firmnoFirmsevenst;
    @TableField("firmno_creator")
            private String          firmnoCreator;
    @TableField("firmno_date")
            private Date            firmnoDate;
    @TableField("firmno_modifier")
            private String          firmnoModifier;
    @TableField("firmno_updatetime")
            private Date            firmnoUpdatetime;
    @TableField("firmno_remove")
            private Integer         firmnoRemove;
    @TableField("firmno_null_1")
            private String          firmnoNull_1;
    @TableField("firmno_null_2")
            private String          firmnoNull_2;
    @TableField("firmno_null_3")
            private String          firmnoNull_3;
    @TableField("firmno_null_4")
            private String          firmnoNull_4;

    public Firmno(Integer firmnoRemove) {
        this.firmnoRemove = firmnoRemove;
    }

    public Firmno(String firmnoId, Integer firmnoRemove) {
        this.firmnoId = firmnoId;
        this.firmnoRemove = firmnoRemove;
    }


    public Firmno(String firmnoId, String firmnoName, String firmnoAddress, String firmnoPhone, String firmnoLxr, String firmnoLxrphone, String firmnoFirmsevenst) {
        this.firmnoId = firmnoId;
        this.firmnoName = firmnoName;
        this.firmnoAddress = firmnoAddress;
        this.firmnoPhone = firmnoPhone;
        this.firmnoLxr = firmnoLxr;
        this.firmnoLxrphone = firmnoLxrphone;
        this.firmnoFirmsevenst = firmnoFirmsevenst;
    }

    public Firmno(String firmnoName, String firmnoAddress, String firmnoPhone, String firmnoLxr, String firmnoLxrphone, String firmnoFirmsevenst, String firmnoCreator, Date firmnoDate, String firmnoModifier, Date firmnoUpdatetime, Integer firmnoRemove) {
        this.firmnoName = firmnoName;
        this.firmnoAddress = firmnoAddress;
        this.firmnoPhone = firmnoPhone;
        this.firmnoLxr = firmnoLxr;
        this.firmnoLxrphone = firmnoLxrphone;
        this.firmnoFirmsevenst = firmnoFirmsevenst;
        this.firmnoCreator = firmnoCreator;
        this.firmnoDate = firmnoDate;
        this.firmnoModifier = firmnoModifier;
        this.firmnoUpdatetime = firmnoUpdatetime;
        this.firmnoRemove = firmnoRemove;
    }
}
