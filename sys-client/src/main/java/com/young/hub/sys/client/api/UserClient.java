package com.young.hub.sys.client.api;

import cn.young.boot.common.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户RPC Client
 *
 * @author Mole. meiko_ooo@163.com
 * @since 2025/1/22 00:00
 */
public interface UserClient {

    @GetMapping(value = "query-by-username")
    ResponseData<Void> selectUserByUserName(@RequestParam("username") String username);
}
