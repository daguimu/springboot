package com.boot.service;

import com.boot.model.DeptModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:47
 */
public interface DeptService extends JpaRepository<DeptModel,Integer> {
}
