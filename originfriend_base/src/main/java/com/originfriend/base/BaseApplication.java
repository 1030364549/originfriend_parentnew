package com.originfriend.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }
    /*将注解的方法，作为Spring中的Bean存入并管理，启动项目，
      Spring水桶中就会存在一个idWorker的方法漂浮*/
    @Bean
    public IdWorker idWorker(){
        /*实例化IdWorker并且调用带参构造*/
        return new IdWorker(1,1);
    }


}
