package com.young.hub.sys.core.dependency.a;

import cn.young.boot.common.ResponseData;
import org.springframework.stereotype.Component;

/**
 * A 业务的下的某个功能的下级服务
 *
 * @author Mole. meiko_ooo@163.com
 * @since 2025/1/22 00:12
 */
@Component
public class A1SubService {

   /* @Resource
    private AClient aClient;*/

    public void getA1InfoById(Long id) {

        //ResponseData<?> response  = aClient.getA1ById(id);

    }
}
