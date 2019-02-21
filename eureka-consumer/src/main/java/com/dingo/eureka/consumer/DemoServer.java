package com.dingo.eureka.consumer; /**
 * @Description: $discription
 * @Author: Dingo
 * @Version: 1.0
 * @date: 2019/2/20 16:52
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Auther: Dingo
 * @Date: 2019/2/20 16:52
 * @Description:
 */
@FeignClient(name = "service-provider" ,fallback = DemoFallback.class,decode404 = true)
@Service
public interface DemoServer {

    @PostMapping(value = "/post")
    Map getUser(@RequestParam("id") Integer id);

}
