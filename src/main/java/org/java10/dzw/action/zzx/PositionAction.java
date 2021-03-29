package org.java10.dzw.action.zzx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.java10.dzw.biz.zzx.PositionBiz;
import org.java10.dzw.dao.zzx.PositionDao;
import org.java10.dzw.pojo.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author: try
 * @date: 2021/3/25 9:47:22
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/api/position")
public class PositionAction {

    @Autowired
    PositionBiz positionBiz;

    @GetMapping
    public Map<String,Object> positionAll(){
        Map<String,Object> apiMap = new HashMap<>();
        QueryWrapper<Position> query = Wrappers.query();
        query.eq("position_deleted_marker",0);
        List<Position> positions = positionBiz.list(query);
        List<Map<String,Object>> mapList = new ArrayList<>();
        for (Position emp : positions) {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("value",emp.getPositionId());
            map.put("label",emp.getPositionName());
            mapList.add(map);
        }
        apiMap.put("data",mapList);
        apiMap.put("code",200);
        apiMap.put("msg","ok");
        return apiMap;
    }

    @PostMapping("/positionList")
    public Map<String,Object> positionList(@RequestBody Map<String,Object> position){
        Map<String, Object> map = new HashMap<>();
        QueryWrapper<Position> qw = Wrappers.query();
        qw.eq("position_deleted_marker",0);
        System.out.println(position.get("positionId"));
        Object positionId = position.get("positionId");
        if (positionId != null) {
            qw.eq("position_id",positionId);
        }
        String positionName = (String) position.get("positionName");
        if (positionName != null && !positionName.equals("")) {
            qw.like("position_name",positionName);
        }
        List<Position> positions = positionBiz.list(qw);
        map.put("data",positions);
        map.put("code",200);
        map.put("msg","ok");
        return map;
    }

    @PostMapping("/add")
    public Map<String,Object> positionAdd(@RequestBody Position position){
        Map<String, Object> map = new HashMap<>();
        position.setPositionAddPeople(1);
        position.setPositionAddDate(new Date());
        position.setPositionDeletedMarker(0);
        map.put("data",positionBiz.save(position));
        map.put("code",200);
        map.put("msg","ok");
        return map;
    }

    @DeleteMapping("/{i}")
    public Map<String,Object> positionDelect(@PathVariable Integer i){
        Map<String, Object> map = new HashMap<>();
        map.put("data",positionBiz.removeById(i));
        map.put("code",200);
        map.put("msg","ok");
        return map;
    }

    @PutMapping
    public Map<String, Object> positionUpdate(@RequestBody Position position){
        Map<String, Object> map = new HashMap<>();
        // todo 修改没有条件
        QueryWrapper<Position> qw = Wrappers.query();
        qw.eq("position_id",position.getPositionId());
        position.setPositionUpdatePeople(1);
        position.setPositionUpdateDate(new Date());
        map.put("data",positionBiz.update(position,qw));
        map.put("code",200);
        map.put("msg","ok");
        return map;
    }
}