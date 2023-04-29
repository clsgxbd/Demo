package com.demo.main.controller;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author damu
 * @date 2023/4/27
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ThreadPoolExecutor executor;

    @GetMapping("/t1")
    public String test(){

        executor.execute(()->{

            try {
                Thread.sleep(10000);
                int a = 1 / 0;
                System.out.println(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("====线程池===");
        });

        return "成功";

    }



    public static void main(String[] args) {
        String a = null;
        String s = a + "s";
        System.out.println(s);
        if (!(a + s).contains("钢琴")) {
            System.out.println("不包含 钢琴");
        }

        long num1 = 1L;
        int num2 = 2;
        System.out.println(num1 > num2);
    }
}
