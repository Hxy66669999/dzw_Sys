package org.java10.dzw.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.java10.dzw.pojo.Dimission;
import org.java10.dzw.pojo.Position;

import java.util.Date;

/**
 * @author: tryBin
 * @date: 2021/3/30 14:36:28
 * @version: 0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DimissionObjVo {
    private Dimission dimission;
    private String positionName;
}
