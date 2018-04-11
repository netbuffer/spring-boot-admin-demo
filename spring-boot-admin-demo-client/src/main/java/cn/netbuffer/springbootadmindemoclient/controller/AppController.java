package cn.netbuffer.springbootadmindemoclient.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/")
public class AppController {

    @Resource
    private Environment environment;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return environment.getProperty("spring.application.name");
    }

}
