package com.boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:41
 */
@Entity(name = "train_tb")
@Data
public class TrainModel {
    @Id
    @GeneratedValue
    private Integer tid;
    private String trainContext;
    private String status;
}
