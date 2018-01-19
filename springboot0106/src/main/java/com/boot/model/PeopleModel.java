package com.boot.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:38
 */
@Entity(name = "perople_tb")
@Data
public class PeopleModel {
    @Id
    @GeneratedValue
    private Integer pid;
    private String peopleName;
    private Integer peopleAge;
    private String peopleEmail;
    private String peopleTel;
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    private DeptModel dept;
    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    private RoleModel role;
}
