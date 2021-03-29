package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("dimission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dimission {
    private Integer dimissionId;

    private Date dimissionDate;



    private Integer staffId;

    private String staffName;

    private Integer staffRole;

    private String staffSex;

    private String staffPositionCode;

    private String staffPhone;

    private String staffHomeAddress;

    private Integer staffEducation;

    private Date staffEntryTime;

    private Integer staffStarsId;

    private Integer staffTeamId;

    private Integer stafAddPeople;

    private Date stafAddDate;

    private Integer stafUpdatePeople;

    private Date stafUpdateDate;

    private Integer stafDeletedMarker;



    private Integer dimissionAddPeople;

    private Date dimissionAddDate;

    private Integer dimissionUpdatePeople;

    private Date dimissionUpdateDate;

    private Integer dimissionDeletedMarker;
}