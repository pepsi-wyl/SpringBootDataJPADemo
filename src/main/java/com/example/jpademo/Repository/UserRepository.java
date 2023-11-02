package com.example.Repository;

import com.example.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2023-11-02 16:00
 * UserRepository接口
 */

@Service
public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findByNameOrderByCreateTimeDesc(String name);
}