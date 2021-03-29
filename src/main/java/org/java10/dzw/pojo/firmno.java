package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("firmno")
@Data
@NoArgsConstructor //无参
@AllArgsConstructor //全部参数
public class firmno {

    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO,value="firmno_id")
            private String          firmnoid;
    @TableField("firmno_name")
            private String          firmnoname;
    @TableField("firmno_address")
            private String          firmnoaddress;
    @TableField("firmno_phone")
            private String          firmnophone;
    @TableField("firmno_lxr")
            private String            firmnolxr;
    @TableField("firmno_lxrphone")
            private String          firmnolxrphone;
    @TableField("firmno_firmsevenst")
            private String          firmnofirmsevenst;
    @TableField("firmno_creator")
            private String          firmnocreator;
    @TableField("firmno_date")
            private Date            firmnodate;
    @TableField("firmno_modifier")
            private String          firmnomodifier;
    @TableField("firmno_updatetime")
            private Date            firmnoupdatetime;
    @TableField("firmno_remove")
            private Integer         firmnoremove;
    @TableField("firmno_null_1")
            private String          firmnonull_1;
    @TableField("firmno_null_2")
            private String          firmnonull_2;
    @TableField("firmno_null_3")
            private String          firmnonull_3;
    @TableField("firmno_null_4")
            private String          firmnonull_4;

    public firmno(Integer firmnoremove) {
        this.firmnoremove = firmnoremove;
    }

    public firmno(String firmnoid, Integer firmnoremove) {
        this.firmnoid = firmnoid;
        this.firmnoremove = firmnoremove;
    }

    public firmno(String firmnoid, String firmnoname, String firmnoaddress, String firmnophone, String firmnolxr, String firmnolxrphone, String firmnofirmsevenst) {
        this.firmnoid = firmnoid;
        this.firmnoname = firmnoname;
        this.firmnoaddress = firmnoaddress;
        this.firmnophone = firmnophone;
        this.firmnolxr = firmnolxr;
        this.firmnolxrphone = firmnolxrphone;
        this.firmnofirmsevenst = firmnofirmsevenst;
    }

    public firmno(String firmnoname, String firmnoaddress, String firmnophone, String firmnolxr, String firmnolxrphone, String firmnofirmsevenst, String firmnocreator, Date firmnodate, String firmnomodifier, Date firmnoupdatetime, Integer firmnoremove) {
        this.firmnoname = firmnoname;
        this.firmnoaddress = firmnoaddress;
        this.firmnophone = firmnophone;
        this.firmnolxr = firmnolxr;
        this.firmnolxrphone = firmnolxrphone;
        this.firmnofirmsevenst = firmnofirmsevenst;
        this.firmnocreator = firmnocreator;
        this.firmnodate = firmnodate;
        this.firmnomodifier = firmnomodifier;
        this.firmnoupdatetime = firmnoupdatetime;
        this.firmnoremove = firmnoremove;
    }
}
