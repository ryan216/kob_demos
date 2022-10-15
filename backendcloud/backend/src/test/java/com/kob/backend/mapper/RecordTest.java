package com.kob.backend.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 你与黎明
 * @Description: record
 * @create: 2022-10-14 15:45
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RecordTest {

    @Autowired
    private RecordMapper recordMapper;

    @Test
    public void test_delete(){
        Map<String,Object> map=new HashMap<>();
        map.put("id",1);
        System.out.println(recordMapper.deleteByMap(map));
    }

}
