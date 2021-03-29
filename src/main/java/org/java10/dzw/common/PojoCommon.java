package org.java10.dzw.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: tryBin
 * @date: 2021/3/28 22:54:09
 * @version: 0.0.1
 */
@RestController
@RequestMapping("/api/pojocommon")
public class PojoCommon {

    @GetMapping("/getpojoid")
    public Map<String,Object> getPojoId(){
        Map map = new HashMap<String,Object>();
        String s = UUID.randomUUID().toString().replace("-", "");
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher matcher = pattern.matcher(s);
        String all = matcher.replaceAll("");
        map.put("data", all.substring(0,7));
        map.put("code", 200);
        map.put("msg", "ok");
        return map;
    }
}
