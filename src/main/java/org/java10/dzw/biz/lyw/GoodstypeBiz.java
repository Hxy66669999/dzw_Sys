package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.GoodstypeDao;
import org.java10.dzw.pojo.Goodstype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class GoodstypeBiz  extends ServiceImpl<GoodstypeDao, Goodstype> {

        /*查询类型*/
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
        public   List<Goodstype>  chaxun(){
        QueryWrapper<Goodstype> qw= Wrappers.query();
        qw.eq("goodsType_remove",0);
            List<Goodstype>  oo =   super.getBaseMapper().selectList(qw);
             oo.forEach(temp->{
                 System.out.println(oo);
             });
            return  oo;
        }

        /*新增类型*/
        public  Integer  Thenewtype(String name){

            QueryWrapper<Goodstype> qw= Wrappers.query();
            Integer  list = super.getBaseMapper().insert(new Goodstype(name,"lyw",new Date(),"",new Date(),0));

            return  list;
        }

        /*根据id来修改*/
    public  Integer  Typesofchanges(Integer id,String name){

        QueryWrapper<Goodstype> qw= Wrappers.query();

        Integer  list = super.getBaseMapper().updateById(new Goodstype(id,name));

        return  list;
    }

    public    List<Goodstype>  Idlaiquery(Integer id){
        QueryWrapper<Goodstype> qw= Wrappers.query();
        qw.eq("goodsType_id",id);
        List<Goodstype>  list = super.getBaseMapper().selectList(qw);

        return  list;
    }

    public   List<Goodstype> search(String name){
        List<Goodstype>  list=null;
        System.out.println(name);
        if (name == null && name.equals("")){
            QueryWrapper<Goodstype> qw= Wrappers.query();
            list = super.getBaseMapper().selectList(null);
        }else {
            System.out.println("++"+(name != null));
            QueryWrapper<Goodstype> qw= Wrappers.query();
            qw.eq("goodsType_name",name);
            list = super.getBaseMapper().selectList(qw);
        }
        return  list;
    }

    public Integer delete1(Integer id){
        QueryWrapper<Goodstype> qw= Wrappers.query();

        Integer list = super.getBaseMapper().updateById(new Goodstype(id,1));
        return  list;

    }


}
