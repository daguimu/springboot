package com.boot.service;

import com.boot.model.TrainModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:48
 */
public interface TrainService extends JpaRepository<TrainModel,Integer> {
}
