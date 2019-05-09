package com.aision.iot.platform.zuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yim
 * @description zuul前置过滤器
 * @date 2019/5/6
 */
public class PreZuulFilter extends ZuulFilter {
    /**
     * 前置过滤
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest servletRequest = RequestContext.getCurrentContext().getRequest();
        servletRequest.getSession();
        return null;
    }
}
