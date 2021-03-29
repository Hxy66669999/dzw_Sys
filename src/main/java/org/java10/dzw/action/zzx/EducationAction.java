package org.java10.dzw.action.zzx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.java10.dzw.biz.zzx.EducationBiz;
import org.java10.dzw.pojo.Education;
import org.java10.dzw.pojo.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: tryBin
 * @date: 2021/3/29 10:09:56
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/api/education")
public class EducationAction {
    @Autowired
    EducationBiz educationBiz;

    @GetMapping
    public Map<String,Object> getEducation(){
        HashMap<String, Object> mapApi = new HashMap<>();
        QueryWrapper<Education> query = Wrappers.query();
        query.eq("education_deleted_marker",0);
        List<Education> educations = educationBiz.list(query);
        List<Map<String,Object>> mapList = new ArrayList();
        for (Education emp : educations) {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("value",emp.getEducationId());
            map.put("label",emp.getEducationName());
            mapList.add(map);
        }
        mapApi.put("code",200);
        mapApi.put("data",mapList);
        mapApi.put("msg","ok");
        return mapApi;
    }
}
