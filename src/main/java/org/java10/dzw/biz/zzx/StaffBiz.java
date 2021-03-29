package org.java10.dzw.biz.zzx;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.zzx.StaffDao;
import org.java10.dzw.pojo.Staff;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: try
 * @date: 2021/3/26 0:16:34
 * @version: 0.0.1
 */
@Service
public class StaffBiz extends ServiceImpl<StaffDao, Staff> {

    /**
     * 离职
     * @param staff
     * @return
     */
    public Boolean dimission(Staff staff){

        UpdateWrapper<Staff> update = Wrappers.update();
        update.set("staf_update_people",1);
        update.set("staf_update_date",new Date());
        update.set("staf_deleted_marker",1);
        update.eq("staff_id",staff.getStaffId());

        int i = super.getBaseMapper().update(staff, update);
        return i > 0;
    }
}
