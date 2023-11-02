package com.example.jpademo.Repository;

import com.example.jpademo.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2023-11-02 16:00
 * UserRepository接口
 */

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    // 自定义操作数据库方法
    List<User> findByNameOrderByCreateTimeDesc(String name);
}