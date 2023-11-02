package com.example.jpademo;

import com.example.jpademo.Repository.UserRepository;
import com.example.jpademo.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;

@EnableJpaRepositories  // 开启JpaRepository功能
@SpringBootApplication
public class JpaDemoApplication implements ApplicationRunner {
    private final UserRepository userRepository;

    public JpaDemoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 插入数据
         */
//        User user = User.builder()
//                .name("小米")
//                .createTime(new Date())
//                .updateTime(new Date())
//                .build();
//        userRepository.save(user);

        /**
         * 删除数据
         */
//        userRepository.deleteById(1L);

        /**
         * 查询总数
         */
//        System.out.println(userRepository.count());

        /**
         * 查询所有
         */
        Iterable<User> users = userRepository.findAll();
        users.forEach(System.out::println);

        /**
         * 根据名称并且按照创建时间降序查询
         */
        List<User> userList = userRepository.findByNameOrderByCreateTimeDesc("小米");
        userList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }
}