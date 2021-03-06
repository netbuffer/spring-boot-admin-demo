package cn.netbuffer.springbootadmindemoserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminDemoServerApplication.class, args);
    }

}
