package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    //根据id查询产品
    public Product findById(String id) throws Exception;

    //查询所有的产品信息
    public List<Product> findAll() throws Exception;


    void save(Product product);
}
