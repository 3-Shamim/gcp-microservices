package com.learningstuff.orderservice.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩/১২/২১
 * Time: ৪:৩৮ PM
 * Email: mdshamim723@gmail.com
 */

@FeignClient(value = "user-service", url = "${user-service-url}")
public interface UserServiceFeignClient {

    @GetMapping(value = "")
    public String getBaseUrl();

}
