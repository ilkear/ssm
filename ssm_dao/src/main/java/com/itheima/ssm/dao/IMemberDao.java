package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author : Xiaos.Lyn
 * @date : 2019/7/14
 */
public interface IMemberDao {

    Member findById(String id) throws Exception;
}
//@Select("select * from member where id=#{id}")