package org.java10.dzw.action.Hxy;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java10.dzw.biz.Hxy.ClientdatainfoBiz;
import org.java10.dzw.pojo.Clientdatainfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/Hxy/ClientdatainfoAction")
public class ClientdatainfoAction {
    @Autowired
    private ClientdatainfoBiz clientdatainfoBiz;

    /**
     * 查询全部客户资料
     */
    @GetMapping("/clientdataQueryAll")
    public PageInfo<Clientdatainfo> clientdataQueryAll(Integer pageNum,Integer pageSize,String cdfName){
        PageHelper.startPage(pageNum,pageSize);
        //cdfName = cdfName==""?null:cdfName;
        return clientdatainfoBiz.clientdataQueryAll(cdfName);
    }

    /**
     * 新增客户
     */
    @PostMapping("/addClientdata")
    public Map<String,Object> addClientdata(@RequestBody Clientdatainfo clientdatainfo){
        Map<String,Object> map = new HashMap<>();
        Integer num = clientdatainfoBiz.addClientdata(clientdatainfo);
        if(num > 0){
            map.put("code",200);
            map.put("msg","新增成功！");
        }else {
            map.put("code",500);
            map.put("msg","新增失败！");
        }
        return map;
    }

    /**
     * 根据编号查询
     */
    @GetMapping("/queryByNum")
    public Clientdatainfo queryByNum(String cdfNumber){
        System.out.println(cdfNumber);
        return clientdatainfoBiz.queryByNum(cdfNumber);
    }

    /**
     * 修改客户资料
     */
    @PostMapping("/updateClientDataByNum")
    public Map<String,Object> updateClientDataByNum( @RequestBody Clientdatainfo clientdatainfo){
        Map<String,Object> map = new HashMap<>();
        Integer num = clientdatainfoBiz.updateClientDataByNum(clientdatainfo);
        if(num > 0){
            map.put("code",200);
            map.put("msg","修改成功！");
        }else {
            map.put("code",500);
            map.put("msg","修改失败！");
        }
        return map;
    }
}
