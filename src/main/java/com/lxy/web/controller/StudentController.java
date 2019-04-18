package com.lxy.web.controller;
import com.lxy.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String list(Model m){
        //添加数据
        m.addAttribute("username","lxy");
        m.addAttribute("age","21");
        List<Student> list = new ArrayList<>();
        list.add(new Student(1001,"习近平","男"));
        list.add(new Student(1002,"李克强","男"));
        list.add(new Student(1003,"汪洋","男"));
        m.addAttribute("stulist",list);
        return "stu/list";//找模板页面
    }

}
