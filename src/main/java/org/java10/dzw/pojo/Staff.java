package org.java10.dzw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff implements Serializable {
    private Integer staffId;

    private String staffName;

    private Integer staffRole;

    private String staffSex;

    private String staffPositionCode;

    private String staffPhone;

    private String staffHomeAddress;

    private Integer staffEducation;

    private Date staffEntryTime;

    private Integer staffTeamId;

    private Integer staffStarsId;

    private Integer stafAddPeople;

    private Date stafAddDate;

    private Integer stafUpdatePeople;

    private Date stafUpdateDate;

    private Integer stafDeletedMarker;
}