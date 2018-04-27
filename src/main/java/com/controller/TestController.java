package com.controller;

import com.dao.TestDao;
import com.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping(value = "/testInsert", method = RequestMethod.POST)
    @ResponseBody
    private String testInsert(@RequestBody TestModel testModel) {
        int result = testDao.insertTestInfo(testModel);
        return result + "";
    }
}
