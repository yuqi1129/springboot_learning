package com.yuqi.jpalearning.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:42
 **/
@Component
@Slf4j
public class IpAndMessageInterceptor extends HandlerInterceptorAdapter {
    private static final String BEGINTIME_KEY = "begin_time";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.preHandle(request, response, handler);

        long current = System.nanoTime();
        request.setAttribute(BEGINTIME_KEY, current);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        //super.postHandle(request, response, handler, modelAndView);
        log.info("Remote ip = {}, request method = {}, took = {}ms",
                request.getRemoteHost(),
                request.getMethod(),
                (System.nanoTime() - (Long) request.getAttribute(BEGINTIME_KEY)) / 1000_000);
    }
}
