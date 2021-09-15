package cn.netbuffer.springbootadmindemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAdminDemoClientApplication {

    @Bean
    public HttpTraceRepository buildHttpTraceRepository(){
        return new InMemoryHttpTraceRepository();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminDemoClientApplication.class, args);
    }

}
