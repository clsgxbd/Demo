package com.demo.main.controller;


import com.demo.commen.result.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author damu
 * @date 2023/4/18
 */
@Api(tags = "用户管理器")
@RestController
@RequestMapping("/demo/user")
public class UserController {


    @ApiOperation("获取用户名称")
    @GetMapping("/get/username")
    public ResultDTO<String> getUserName() {
        return new ResultDTO<>("damu");
    }


}
