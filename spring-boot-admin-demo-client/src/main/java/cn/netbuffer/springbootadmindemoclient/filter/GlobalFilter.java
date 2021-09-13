package cn.netbuffer.springbootadmindemoclient.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class GlobalFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        log.debug("path={} ua={} cookie={}",httpServletRequest.getRequestURI(),httpServletRequest.getHeader("User-Agent"),httpServletRequest.getHeader("Cookie"));
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
