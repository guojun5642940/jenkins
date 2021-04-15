package com.test.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * @author guojun
 * @version 1.0
 * @date 4/15/21 3:42 PM
 */
@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
