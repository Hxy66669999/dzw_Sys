package org.java10.dzw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("education")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Integer educationId;

    private String educationName;

    private String educationCode;

    private Integer educationAddPeople;

    private Date educationAddDate;

    private Date educationUpdateDate;

    private Date educationUpdatePeople;

    private Integer educationDeletedMarker;
}