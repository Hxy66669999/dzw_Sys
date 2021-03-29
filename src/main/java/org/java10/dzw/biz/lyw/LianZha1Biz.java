package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.LianZha1Dao;
import org.java10.dzw.vo.LianZha1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LianZha1Biz  extends ServiceImpl<LianZha1Dao, LianZha1> {

            @Autowired
            private   LianZha1Dao  lianZha1Dao;

            public List<LianZha1>  chaxun(Integer id){
                List<LianZha1>  list  =  lianZha1Dao.LIST(id);
                return list;
            }

        public List<LianZha1>  Inthequery(){
            List<LianZha1>  list  =  lianZha1Dao.list();
            return list;
        }

    public List<LianZha1>  Inthequery2(String name){
        List<LianZha1>  list  =  lianZha1Dao.list1(name);
        return list;
    }
}
