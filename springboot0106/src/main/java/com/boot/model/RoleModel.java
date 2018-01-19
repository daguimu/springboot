package com.boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:36
 */
@Entity(name = "role_tb")
@Data
public class RoleModel {
    @Id
    @GeneratedValue
    private Integer rid;
    private String roleName;
}
