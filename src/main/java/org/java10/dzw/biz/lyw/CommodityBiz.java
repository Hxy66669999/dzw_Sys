package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.CommodityDao;
import org.java10.dzw.pojo.commodity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CommodityBiz extends ServiceImpl<CommodityDao, commodity> {
            public List<commodity> chauxn(){
                List<commodity>  list  =  super.getBaseMapper().selectList(null);

                return list;
            }
}
