package com.demo.main.config;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author damu
 * @date 2023/4/27
 */
@Configuration
public class ThreadPoolExce {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){
        return new ThreadPoolExecutor(
                100,
                100,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10000)
        );
    }

}
