package cn.netbuffer.springbootadmindemoclient.controller;

import cn.netbuffer.springbootadmindemoclient.config.AppConfigMBean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/")
public class AppController {

    @Resource
    private Environment environment;
    @Resource
    private AppConfigMBean appConfigMBean;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return environment.getProperty("spring.application.name");
    }

    @GetMapping("appName")
    public Object getAppName() {
        return appConfigMBean.getAppName();
    }

}
