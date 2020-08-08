package org.spring.springboot.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@WebFilter(urlPatterns = "/*", filterName = "logFilter")
public class LogCostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        long start = System.currentTimeMillis();
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        Object account = req.getAttribute("account");
        if(account != null) {
            //表示登录成功
            filterChain.doFilter(servletRequest,servletResponse);  //向下访问资源
        }else {
            //尚未登录，转到登录页
            servletRequest.setAttribute("msg","访问受限资源，需要提前登录...");
            req.getRequestDispatcher("/index/login.jsp").forward(servletRequest,servletResponse);
        }
        System.out.println("LogFilter2 Execute cost=" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}