package com.example.model.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author by pepsi-wyl
 * @date 2023-11-02 15:56
 * User实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;
}