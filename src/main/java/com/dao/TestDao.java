package com.dao;

import com.model.TestModel;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    /**
     * 测试数据库插入
     * @param testModel
     * @return
     */
    int insertTestInfo(@Param("testModel") TestModel testModel);
}
