package com.boot.controller;

import com.boot.model.DeptModel;
import com.boot.model.PeopleModel;
import com.boot.model.RoleModel;
import com.boot.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program : untitled1
 * @Description :
 * @Author : Guimu
 * @Create : 2018-01-16 20:51
 */
@RestController
public class HelloController {
    @Autowired
    PeopleService peopleService;

    @RequestMapping(value = "/gitpdf")
    public String gitpdf(@RequestParam(value = "path") String path,@RequestParam(value = "width") Integer width,@RequestParam(value = "hight") Integer hight,@RequestParam(value = "dpi") Integer dpi,@RequestParam(value = "type") String type){
        PdfReader.parsePdf(path,width,hight,dpi,type);
        return "gitpdf";
    }
}
