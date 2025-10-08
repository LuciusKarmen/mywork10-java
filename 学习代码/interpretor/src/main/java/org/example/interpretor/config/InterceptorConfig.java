package org.example.interpretor.config;

import org.example.interpretor.interpretor.ProjectInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//拦截器注册配置类
//所有的拦截器在这里注册
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    private final ProjectInterceptor projectInterceptor;

    public InterceptorConfig(ProjectInterceptor projectInterceptor) {
        this.projectInterceptor = projectInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor)
                .addPathPatterns("/a/**"); // 拦截 /a 下的所有请求
    }
}