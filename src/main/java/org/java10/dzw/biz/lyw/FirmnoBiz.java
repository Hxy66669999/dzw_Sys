package org.java10.dzw.biz.lyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.java10.dzw.dao.lyw.FirmnoDao;
import org.java10.dzw.pojo.Firmno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmnoBiz extends ServiceImpl<FirmnoDao, Firmno> {

            //查询厂商编号
            public List<Firmno> EnquiryofManufacturer(){
                QueryWrapper<Firmno> qw= Wrappers.query();
                  qw.eq("firmno_remove",0);
                List<Firmno>  list  =  super.getBaseMapper().selectList(qw);

                return list;
            }


        //修改厂商状态
        public   Integer EnquiryofManufacturer2(Integer id){
            QueryWrapper<Firmno> qw= Wrappers.query();
            qw.eq("firmno_id",id);
            Integer  list  =  super.getBaseMapper().update(new Firmno(1),qw);

            return list;
        }

        //根据厂商id来查询
        public    List<Firmno> EnquiryofManufacturer3(Integer id){
            QueryWrapper<Firmno> qw= Wrappers.query();
            qw.eq("firmno_id",id);
            List<Firmno>  list  =  super.getBaseMapper().selectList(qw);

            return list;
        }
        //根据厂商id来查询
        public   Integer EnquiryofManufacturer4(Firmno firmno){
            QueryWrapper<Firmno> qw= Wrappers.query();

           Integer list  =  super.getBaseMapper().updateById(new Firmno(firmno.getFirmnoId(),
                    firmno.getFirmnoName(),
                    firmno.getFirmnoAddress(),
                    firmno.getFirmnoPhone(),
                    firmno.getFirmnoLxr(),
                    firmno.getFirmnoLxrphone(),
                    firmno.getFirmnoFirmsevenst()));

            return list;
        }
    //根据厂商id来查询
    public   Integer EnquiryofManufacturer5(Firmno firmno){
        QueryWrapper<Firmno> qw= Wrappers.query();

        Integer list  =  super.getBaseMapper().insert(new Firmno(firmno.getFirmnoName(),
                firmno.getFirmnoAddress(),
                firmno.getFirmnoPhone(),
                firmno.getFirmnoLxr(),
                firmno.getFirmnoLxrphone(),
                firmno.getFirmnoFirmsevenst(),
                firmno.getFirmnoCreator(),
                firmno.getFirmnoDate(),
                firmno.getFirmnoModifier(),
                firmno.getFirmnoUpdatetime(),
                firmno.getFirmnoRemove()));

        return list;
    }
}
