package com.wpx.shell;

import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class ProviderSwaggerConfig {
	@Bean
    public Docket myDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo = new ApiInfo("标题", "描述","版本1.0","apiDocs","1256317570@qq.com","","");
        docket.apiInfo(apiInfo);
        return docket;
    }

}
