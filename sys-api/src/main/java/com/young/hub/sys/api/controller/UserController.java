package com.young.hub.sys.api.controller;

import cn.young.boot.common.ResponseData;
import com.young.hub.sys.client.api.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mole. meiko_ooo@163.com
 * @since 2025/1/22 00:03
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController implements UserClient {


    public ResponseData<Void> selectUserByUserName(String username) {

        return ResponseData.success();
    }
}
