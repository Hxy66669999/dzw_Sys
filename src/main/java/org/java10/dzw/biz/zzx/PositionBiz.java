package org.java10.dzw.biz.zzx;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.zzx.PositionDao;
import org.java10.dzw.pojo.Position;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: try
 * @date: 2021/3/25 11:17:05
 * @version: 0.0.1
 */
@Service
public class PositionBiz extends ServiceImpl<PositionDao, Position> {

    public boolean removeById(Integer id) {
        int i = super.getBaseMapper().updateById(new Position(id, null, null, null, null, 1, new Date(), 1));
        if (i > 0){
            return true;
        }
        return false;
    }
}
