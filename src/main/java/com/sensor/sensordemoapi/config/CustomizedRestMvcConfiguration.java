package com.sensor.sensordemoapi.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class CustomizedRestMvcConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.setReturnBodyOnCreate(true);
        config.returnBodyOnCreate("created");
        config.setReturnBodyOnUpdate(true);
        config.returnBodyOnUpdate("updated");
    }
}
