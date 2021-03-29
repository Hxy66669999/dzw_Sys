package org.java10.dzw.action.zzx;

import org.java10.dzw.biz.zzx.DimissionBiz;
import org.java10.dzw.biz.zzx.StaffBiz;
import org.java10.dzw.pojo.Dimission;
import org.java10.dzw.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: tryBin
 * @date: 2021/3/29 11:35:11
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/api/dimission")
public class DimissionAction {
    @Autowired
    DimissionBiz dimissionBiz;
    @Autowired
    StaffBiz staffBiz;

    @PostMapping
    public Map<String,Object> addDimission(@RequestBody Staff staff){

        // 离职
        staffBiz.dimission(staff);

        Dimission dimission = new Dimission();
        Date date = new Date();
        dimission.setDimissionDate(date);
        // 员工部分
        dimission.setStaffId(staff.getStaffId());
        dimission.setStaffName(staff.getStaffName());
        dimission.setStaffPhone(staff.getStaffPhone());
        dimission.setStaffRole(staff.getStaffRole());
        dimission.setStaffSex(staff.getStaffSex());
        dimission.setStaffStarsId(staff.getStaffStarsId());
        dimission.setStaffTeamId(staff.getStaffTeamId());
        dimission.setStaffEducation(staff.getStaffEducation());
        dimission.setStaffEntryTime(staff.getStaffEntryTime());
        dimission.setStaffHomeAddress(staff.getStaffHomeAddress());
        dimission.setStaffPositionCode(staff.getStaffPositionCode());
        dimission.setStafAddPeople(staff.getStafAddPeople());
        dimission.setStafAddDate(staff.getStafAddDate());
        dimission.setStafUpdatePeople(staff.getStafUpdatePeople());
        dimission.setStafUpdateDate(staff.getStafUpdateDate());

        dimission.setDimissionAddPeople(1);
        dimission.setDimissionAddDate(date);
        dimission.setDimissionDeletedMarker(0);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code",200);
        map.put("data",dimissionBiz.save(dimission));
        map.put("mgs","ok");
        return map;
    }
}
