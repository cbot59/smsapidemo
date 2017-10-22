package com.aldi.smsapi.config;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.apache.velocity.tools.view.VelocityViewServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean strutsFilter() {
	FilterRegistrationBean bean = new FilterRegistrationBean();
	bean.setFilter(new StrutsPrepareAndExecuteFilter());
	bean.setName("Struts Filter");
	bean.addUrlPatterns("/*");
	return bean;
    }

    @Bean
    public ServletRegistrationBean velocityServlet() {
	ServletRegistrationBean bean = new ServletRegistrationBean();
	bean.setServlet(new VelocityViewServlet());
	bean.setName("Velocity Servlet");
	bean.addUrlMappings("*.vm");
	return bean;
    }
}
