package com.njit.fileshare.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsApplication.class, args);
    }

    //为了打包项目

    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder){
        return builder.sources(this.getClass());
    }


}
