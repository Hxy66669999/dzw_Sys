package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("Position")
public class Position implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer positionId;
    private String positionName;
    private String positionCode;
    private Integer positionAddPeople;
    private Date positionAddDate;
    private Integer positionUpdatePeople;
    private Date positionUpdateDate;
    private Integer positionDeletedMarker;
}
