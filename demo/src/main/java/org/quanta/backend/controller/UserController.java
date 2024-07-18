package org.quanta.backend.controller;

import org.quanta.backend.dto.AuthDTO;
import org.quanta.backend.service.IUserService;
import lombok.RequiredArgsConstructor;

import org.quanta.controller.BaseController;
import org.quanta.core.beans.Response;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
@RestController
@RequiredArgsConstructor
public class UserController extends BaseController implements IUserController {
    private final IUserService userService;

    /**
     * 登录并获取token
     */
    @Override
    public Response<?> login(@RequestBody AuthDTO param) {
        return Response.success(userService.login(param.getUsername(),param.getPassword()));
    }

    @Override
    public Response<?> register(@RequestBody AuthDTO param) {
        userService.register(param.getUsername(),param.getPassword());
        return Response.success();
    }
}
