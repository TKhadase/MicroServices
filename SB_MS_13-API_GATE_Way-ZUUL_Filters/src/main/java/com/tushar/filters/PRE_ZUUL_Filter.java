package com.tushar.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PRE_ZUUL_Filter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("PRE_ZUUL_Filter.shouldFilter()");
		// enable the filter by returning true
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("PRE_ZUUL_Filter.run()");
		RequestContext context= RequestContext.getCurrentContext();//access to other objects
		HttpServletRequest req = context.getRequest(); 
		System.out.println("PRE_ZUUL_Filter.run(getContentType)  "+req.getContentType());
		System.out.println("PRE_ZUUL_Filter.run(getMethod) "+req.getMethod());
		System.out.println("PRE_ZUUL_Filter.run(getServletPath) "+req.getServletPath());
		System.out.println("PRE_ZUUL_Filter.run(getRequestURI) "+req.getRequestURI());
		System.out.println("PRE_ZUUL_Filter.run(getRequestURL) "+req.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("PRE_ZUUL_Filter.filterType()");
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		System.out.println("PRE_ZUUL_Filter.filterOrder()");
		return 0; //high priority
	}

}
