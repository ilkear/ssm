package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll(int pageNum,int pageSize) throws Exception;

    void save(Product product) throws Exception;
}
