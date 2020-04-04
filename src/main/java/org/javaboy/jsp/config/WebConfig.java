package org.javaboy.jsp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 配置jsp的视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // 注册jsp 添加前缀和后缀
        registry.jsp("/jsp/",".jsp");
    }
}
