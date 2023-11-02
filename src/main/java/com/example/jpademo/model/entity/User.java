package com.example.jpademo.model.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * @author by pepsi-wyl
 * @date 2023-11-02 15:56
 * User实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity // 声明实体类
@Table(name = "USER") // 指定表名
public class User implements Serializable {

    // 主键声明，并指定主键生成策略和生成器
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    // Filed
    private String name;

    // 指定一个属性所映射的字段信息
    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;
}