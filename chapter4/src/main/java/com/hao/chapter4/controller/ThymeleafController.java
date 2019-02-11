package com.hao.chapter4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class ThymeleafController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        modelAndView.setViewName("index");
        // 设置属性
        modelAndView.addObject("title","这是我的第一个WEB页面");
        modelAndView.addObject("desc","欢迎来到SpringBoot-Study系统");
        Author author = new Author();
        author.setAge(25);
        author.setName("Hercules");
        author.setEmail("1195654629@qq.com");
        modelAndView.addObject("author",author);
        return modelAndView;
    }

    @GetMapping("/index1")
    public String index1(HttpServletRequest request){
        request.setAttribute("title","这是我的第一个WEB页面");
        request.setAttribute("desc","欢迎来到SpringBoot-Study系统");
        Author author = new Author();
        author.setAge(25);
        author.setName("Hercules");
        author.setEmail("1195654629@qq.com");
        request.setAttribute("author",author);
        return "index";
    }

    class Author {
        private String name;
        private int age;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
