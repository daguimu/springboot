package com.boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:35
 */
@Data
@Entity(name="dept_tb")
public class DeptModel {
    @Id
    @GeneratedValue
    private Integer did;
    private String deptName;
}
