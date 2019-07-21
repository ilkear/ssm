package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : Xiaos.Lyn
 * @date : 2019/7/14
 */
public interface ITravellerDao {

    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
//@Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")