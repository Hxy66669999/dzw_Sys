package org.java10.dzw.dao.Hxy;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.java10.dzw.pojo.Vehicledatainfo;

import java.util.List;

public interface VehicledatainfoMapper extends BaseMapper<Vehicledatainfo> {
    @Results({@Result(column="vdf_platenum",property="vdfPlatenum")})
    @Select("SELECT * FROM `vehicledatainfo` WHERE `vdf_remove` = 0 AND `vdf_platenum` LIKE '%%'")
    List<Vehicledatainfo> queryAllCat(@Param("vdfPlatenum") String vdfPlatenum);
}