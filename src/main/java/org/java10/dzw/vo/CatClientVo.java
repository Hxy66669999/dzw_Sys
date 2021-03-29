package org.java10.dzw.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.java10.dzw.pojo.Vehicledatainfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatClientVo {

    //车辆品牌
    private  String catBernd;
    //车辆类型
    private  String catType;
    //车对象
    private Vehicledatainfo vehicledatainfo;


}
