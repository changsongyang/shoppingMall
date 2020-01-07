package com.suny.taotao.manager.portal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author sunjianrong
 * @date 2020-01-07 15:47
 */
@EnableAutoConfiguration
@EnableAsync
public class PortalApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PortalApplication.class).run(args);
    }

}
