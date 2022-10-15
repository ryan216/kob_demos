package com.kob.backend.mapper;

import com.kob.backend.pojo.Record;
import com.kob.backend.pojo.User;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: 你与黎明
 * @Description: 记录增加
 * @create: 2022-10-05 20:05
 * @Version: 1.0
 */

@SpringBootTest
//@RunWith(SpringRunner.class)
public class AddRecodeTest {

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private  UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testadd(){
        Record record = new Record();
        System.out.println(recordMapper.insert(record));
    }

    @Test
    public void adduser(){

        for(int i=64;i<164;i++){
            User user =new User();
            user.setUsername("user"+i);
            String passwd="123456";
            String encode_password=passwordEncoder.encode(passwd);
            user.setPassword(encode_password);
            user.setRating(1000+i);
            user.setOpenid("123456");
            user.setPhoto("https://cdn.acwing.com/media/user/profile/photo/1_lg_844c66b332.jpg");
            userMapper.insert(user);
        }
    }

    /**
     * @description:  测试编号1，2
     *
     * @param
     *
     * @author: Ryan
     *
     * @create: 2022/10/8 9:42
     *
     * @return: void
    **/
    @Test
    public  void add_user(){
        String username="1";
        String password="1";
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(userMapper.insert(user));
    }



}
