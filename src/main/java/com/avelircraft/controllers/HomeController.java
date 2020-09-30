package com.avelircraft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    @RequestMapping(path = "/")
    public String indexPage(Model model) {
        System.out.println("index");
        return "index";
    }

    @RequestMapping(path = "/index.html")
    public String indexPage2(Model model) {
        System.out.println("index");
        return "index";
    }

    @RequestMapping(path = "/news.html")
    public String newsPage(Model model) {
        System.out.println("news");
        return "news";
    }

    @RequestMapping(path = "/support.html")
    public String supportPage(Model model) {
        System.out.println("support");
        return "support";
    }

    @RequestMapping(path = "/lk.html")
    public String lkPage(Model model) {
        System.out.println("lk");
        return "lk";
    }

}
