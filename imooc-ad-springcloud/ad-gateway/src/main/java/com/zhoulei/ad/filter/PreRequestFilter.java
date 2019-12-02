package com.zhoulei.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override //定义filter类型
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override //定义filter执行的顺序，数字越小，顺序越高
    public int filterOrder() {
        return 0;
    }

    @Override //是否执行过滤器，false表示不执行，true表示执行
    public boolean shouldFilter() {
        return true;
    }

    @Override //表示filter要执行的代码
    public Object run() throws ZuulException {
        RequestContext ctx = new RequestContext();
        ctx.set("startTime",System.currentTimeMillis());
        return null;
    }
}
