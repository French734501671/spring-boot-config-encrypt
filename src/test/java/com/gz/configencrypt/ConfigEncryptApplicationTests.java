package com.gz.configencrypt;

import com.gz.configencrypt.dao.UserRepository;
import com.gz.configencrypt.entity.User;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigEncryptApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private StringEncryptor encryptorBean;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testEncrypt() {
        System.out.println("dev---");
        System.out.println(encryptorBean.encrypt("hongxiang100"));
        System.out.println(encryptorBean.encrypt("hongxiang@1qazZSE$"));

        System.out.println("prod");
        System.out.println(encryptorBean.encrypt("wechat_rw"));
        System.out.println(encryptorBean.encrypt("1CjZzbNX#G11OwqJiQfWkzQnR!X%JiF0"));

        System.out.println("管理员密码---");
        System.out.println(encryptorBean.encrypt("market@efushui.com"));
        System.out.println(encryptorBean.encrypt("Efushui@123"));
        System.out.println("admin----");
        System.out.println(encryptorBean.encrypt("admin"));

    }

    @Test
    public void testFindUser(){
        List<User> all = userRepository.findAll();
        all.forEach(System.out::println);
    }


}
