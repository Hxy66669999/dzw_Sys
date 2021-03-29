package org.java10.dzw.action.zzx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java10.dzw.biz.zzx.StaffBiz;
import org.java10.dzw.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: try
 * @date: 2021/3/26 0:17:25
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/api/staff")
public class StaffAction {
    @Autowired
    private StaffBiz staffBiz;

    @GetMapping("/{n}/{s}")
    public Map<String,Object> staffList(@PathVariable Integer n,@PathVariable Integer s){
        QueryWrapper<Staff> qw = Wrappers.query();
        qw.eq("staf_deleted_marker",0);
        Map<String,Object> map = new  HashMap<>();
        PageHelper.startPage(n,s);
        map.put("data", new PageInfo(staffBiz.list(qw)));
        map.put("code", 200);
        map.put("msg", "ok");
        return map;
    }

    @PutMapping
    public Map<String,Object> updateStaff(@RequestBody Staff staff){
        QueryWrapper<Staff> qw = Wrappers.query();
        qw.eq("staff_id",staff.getStaffId());
        Map<String,Object> map = new  HashMap<>();
        staff.setStafUpdatePeople(1);
        staff.setStafUpdateDate(new Date());
        map.put("data", staffBiz.update(staff,qw));
        map.put("code", 200);
        map.put("msg", "ok");
        return map;
    }

    /**
     * 删除
     * @param i
     * @return
     */
    @Deprecated
    @DeleteMapping("{i}")
    public Map<String,Object> deleteStaff(@PathVariable Integer i){
        UpdateWrapper<Staff> update = Wrappers.update();
        update.set("staf_update_people",1);
        update.set("staf_update_date",new Date());
        update.set("staf_deleted_marker",1);
        update.eq("staff_id",i);
        Map<String,Object> map = new  HashMap<>();
        map.put("data", staffBiz.update(update));
        map.put("code", 200);
        map.put("msg", "ok");
        return map;
    }

    @PostMapping
    public Map<String,Object> addStaff(@RequestBody Staff staff){
        Map<String,Object> map = new  HashMap<>();
        staff.setStafAddPeople(1);
        staff.setStafAddDate(new Date());
        staff.setStafDeletedMarker(0);
        map.put("data", staffBiz.save(staff));
        map.put("code", 200);
        map.put("msg", "ok");
        return map;
    }

}
