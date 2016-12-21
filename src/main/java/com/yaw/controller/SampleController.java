package com.yaw.controller;

import com.yaw.config.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yawpei on 2016/12/21.
 */
@RestController
public class SampleController {

    @Value("${book.author}")
    private String bootAuthor;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/index")
    String index() {
        return "book name is :" + bookName + " and book author is :" + bootAuthor;
    }

    @RequestMapping("/setting")
    public String setting() {
        return "author name:" + authorSetting.getName() + ", author age:" + authorSetting.getAge();
    }
}