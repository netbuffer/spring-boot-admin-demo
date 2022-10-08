package cn.netbuffer.springbootadmindemoclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@Configuration
@ManagedResource(objectName = "appConfig:name=AppConfigMBean")
public class AppConfigMBean {

    @Value("${app.config.name}")
    private String appName;
    private Long max;

    @ManagedAttribute
    public String getAppName() {
        return this.appName;
    }

    @ManagedAttribute(description = "set app name", defaultValue = "test-app-name")
    public void setAppName(String name) {
        this.appName = name;
    }

    @ManagedOperation(description = "method invoke test")
    public String someMethod() {
        return "hello";
    }

    @ManagedAttribute
    public Long getMax() {
        return max;
    }

    @ManagedAttribute(description = "set app max value", defaultValue = "1")
    public void setMax(Long max) {
        this.max = max;
    }
}