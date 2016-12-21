package com.yaw.controller;

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

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/index")
    String index() {
        return "book name is :" + bookName + " and book author is :" + bootAuthor;
    }

}