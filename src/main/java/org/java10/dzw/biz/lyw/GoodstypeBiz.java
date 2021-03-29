package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.GoodstypeDao;
import org.java10.dzw.pojo.goodstype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class GoodstypeBiz  extends ServiceImpl<GoodstypeDao, goodstype> {

        /*查询类型*/
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
        public   List<goodstype>  chaxun(){
        QueryWrapper<goodstype> qw= Wrappers.query();
        qw.eq("goodsType_remove",0);
            List<goodstype>  oo =   super.getBaseMapper().selectList(qw);
             oo.forEach(temp->{
                 System.out.println(oo);
             });
            return  oo;
        }

        /*新增类型*/
        public  Integer  Thenewtype(String name){

            QueryWrapper<goodstype> qw= Wrappers.query();
            Integer  list = super.getBaseMapper().insert(new goodstype(name,"lyw",new Date(),"",new Date(),0));

            return  list;
        }

        /*根据id来修改*/
    public  Integer  Typesofchanges(Integer id,String name){

        QueryWrapper<goodstype> qw= Wrappers.query();

        Integer  list = super.getBaseMapper().updateById(new goodstype(id,name));

        return  list;
    }

    public    List<goodstype>  Idlaiquery(Integer id){
        QueryWrapper<goodstype> qw= Wrappers.query();
        qw.eq("goodsType_id",id);
        List<goodstype>  list = super.getBaseMapper().selectList(qw);

        return  list;
    }

    public   List<goodstype> search(String name){
        List<goodstype>  list=null;
        System.out.println(name);
        if (name == null && name.equals("")){
            QueryWrapper<goodstype> qw= Wrappers.query();
            list = super.getBaseMapper().selectList(null);
        }else {
            System.out.println("++"+(name != null));
            QueryWrapper<goodstype> qw= Wrappers.query();
            qw.eq("goodsType_name",name);
            list = super.getBaseMapper().selectList(qw);
        }
        return  list;
    }

    public Integer delete1(Integer id){
        QueryWrapper<goodstype> qw= Wrappers.query();

        Integer list = super.getBaseMapper().updateById(new goodstype(id,1));
        return  list;

    }


}
