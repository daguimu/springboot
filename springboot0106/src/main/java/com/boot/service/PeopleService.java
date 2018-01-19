package com.boot.service;

import com.boot.model.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:45
 */
public interface PeopleService extends JpaRepository<PeopleModel,Integer> {
}
