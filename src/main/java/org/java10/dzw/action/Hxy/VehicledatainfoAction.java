package org.java10.dzw.action.Hxy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java10.dzw.biz.Hxy.VehicledatainfoBiz;
import org.java10.dzw.pojo.Vehicledatainfo;
import org.java10.dzw.vo.CatClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/Hxy/VehicledatainfoAction")
public class VehicledatainfoAction {
    @Autowired
    private VehicledatainfoBiz vehicledatainfoBiz;

    /**
     * 查询客户车辆信息
     */
    @GetMapping("/queryByClientCat")
    public PageInfo<CatClientVo> queryByClientCat(String vdfCdfnum, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(vdfCdfnum);
        return new PageInfo<CatClientVo>(vehicledatainfoBiz.queryByClientCat(vdfCdfnum));
    }

    /**
     * 新增客户车辆
     * @param vehicledatainfo
     * @return
     */
    @PostMapping("/addClientCat")
    public Map<String,Object> addClientCat(@RequestBody Vehicledatainfo vehicledatainfo){
        Map<String,Object> map = new HashMap<>();

        Integer num = vehicledatainfoBiz.addClientCat(vehicledatainfo);
        if (num > 0){
            map.put("code",200);
            map.put("msg","新增成功！");
        }else {
            map.put("code",500);
            map.put("msg","新增失败！");
        }
        return map;
    }

    /**
     * 查询全部车辆
     */
    @GetMapping("/queryCatAll")
    public PageInfo<CatClientVo> queryCatAll(String vdfPlatenum,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(pageNum);
        System.out.println(pageSize);
        System.out.println(vdfPlatenum);
        return vehicledatainfoBiz.queryCatAll(vdfPlatenum,pageNum,pageSize);
    }
}
