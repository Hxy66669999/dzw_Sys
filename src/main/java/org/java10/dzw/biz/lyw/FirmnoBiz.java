package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.Firmno;
import org.java10.dzw.pojo.firmno;
import org.java10.dzw.pojo.goodstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmnoBiz extends ServiceImpl<Firmno, firmno> {

            //查询厂商编号
            public List<firmno> EnquiryofManufacturer(){
                QueryWrapper<firmno> qw= Wrappers.query();
                  qw.eq("firmno_remove",0);
                List<firmno>  list  =  super.getBaseMapper().selectList(qw);

                return list;
            }


        //修改厂商状态
        public   Integer EnquiryofManufacturer2(Integer id){
            QueryWrapper<firmno> qw= Wrappers.query();
            qw.eq("firmno_id",id);
            Integer  list  =  super.getBaseMapper().update(new firmno(1),qw);

            return list;
        }

        //根据厂商id来查询
        public    List<firmno> EnquiryofManufacturer3(Integer id){
            QueryWrapper<firmno> qw= Wrappers.query();
            qw.eq("firmno_id",id);
            List<firmno>  list  =  super.getBaseMapper().selectList(qw);

            return list;
        }
        //根据厂商id来查询
        public   Integer EnquiryofManufacturer4(firmno firmno){
            QueryWrapper<firmno> qw= Wrappers.query();

           Integer list  =  super.getBaseMapper().updateById(new firmno(firmno.getFirmnoid(),
                    firmno.getFirmnoname(),
                    firmno.getFirmnoaddress(),
                    firmno.getFirmnophone(),
                    firmno.getFirmnolxr(),
                    firmno.getFirmnolxrphone(),
                    firmno.getFirmnofirmsevenst()));

            return list;
        }
    //根据厂商id来查询
    public   Integer EnquiryofManufacturer5(firmno firmno){
        QueryWrapper<firmno> qw= Wrappers.query();

        Integer list  =  super.getBaseMapper().insert(new firmno(firmno.getFirmnoname(),
                firmno.getFirmnoaddress(),
                firmno.getFirmnophone(),
                firmno.getFirmnolxr(),
                firmno.getFirmnolxrphone(),
                firmno.getFirmnofirmsevenst(),
                firmno.getFirmnocreator(),
                firmno.getFirmnodate(),
                firmno.getFirmnomodifier(),
                firmno.getFirmnoupdatetime(),
                firmno.getFirmnoremove()));

        return list;
    }
}
