package com.js.feignclient;

import com.js.api.UserControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: OANacos
 * @Date: 2020/9/30 10:38
 * @Author: jiangshuang
 * @Description:
 */
@FeignClient(value = "oa-user-service")
public interface UserProxyClient extends UserControllerApi {

}
