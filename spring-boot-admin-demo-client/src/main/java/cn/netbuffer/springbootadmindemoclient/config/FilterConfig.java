package cn.netbuffer.springbootadmindemoclient.config;

import cn.netbuffer.springbootadmindemoclient.filter.GlobalFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<GlobalFilter> initAuthenticationFilter() {
        FilterRegistrationBean<GlobalFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        GlobalFilter globalFilter = new GlobalFilter();
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setFilter(globalFilter);
        return filterRegistrationBean;
    }
}
