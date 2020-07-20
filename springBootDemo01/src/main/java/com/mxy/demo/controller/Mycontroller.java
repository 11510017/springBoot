package com.mxy.demo.controller;

import com.mxy.demo.domain.Student;
import com.mxy.demo.services.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//RestController和Controller的区别就是controller可以返回jsp，而RestController只能返回字符串
public class Mycontroller {
    @Autowired
    SelectService selectService;
    @RequestMapping(method = RequestMethod.GET,value = "/find")
    public String selectAll(Model model){
        StringBuilder info=new StringBuilder();
        List<Student> students = selectService.findAll();
        model.addAttribute("students", students);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "hell";

    }
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String hello(){

        return "hell";
    }

}
