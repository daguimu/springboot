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
    @RequestMapping(value = "/add")
    public PeopleModel add(){
        RoleModel role=new RoleModel();
        role.setRoleName("teacher");
        DeptModel dept=new DeptModel();
        dept.setDeptName("java");
        PeopleModel p=new PeopleModel();
        p.setPeopleAge(18);
        p.setPeopleEmail("171@qq.com");
        p.setPeopleTel("18445853593");
        p.setRole(role);
        p.setPeopleName("daguimu");
        p.setDept(dept);
        peopleService.save(p);
        return p;
    }

    @RequestMapping(value = "/gitpdf")
    public String gitpdf(@RequestParam(value = "path") String path,@RequestParam(value = "width") Integer width,@RequestParam(value = "hight") Integer hight,@RequestParam(value = "dpi") Integer dpi,@RequestParam(value = "type") String type){
        PdfReader.parsePdf(path,width,hight,dpi,type);
        return "gitpdf";
    }


    @RequestMapping(value = "htmt")
    public  String html(@RequestParam(value = "url" )String url){
        try{
            HtmlToImage.generateOutput(url);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  "lposda";
    }
    @RequestMapping(value = "htt")
    public  String htt(@RequestParam(value = "url" )String url){
        try{
            HtT.pop(url);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  "lposda";
    }

}
