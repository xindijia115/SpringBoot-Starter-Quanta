package org.quanta.backend.controller;

import org.quanta.backend.dto.AuthDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.quanta.core.beans.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@Api(tags = "用户模块", value = "用户模块")
@RequestMapping("/user")
public interface IUserController {
    /**
     * 登录并获取token
     */
    @ApiOperation(value = "登录")
    @PostMapping("/login")
    Response<?> login(@RequestBody AuthDTO param);

    /**
     * 注册
     */
    @ApiOperation(value = "注册")
    @PutMapping("/register")
    Response<?> register(@RequestBody AuthDTO param);
}
