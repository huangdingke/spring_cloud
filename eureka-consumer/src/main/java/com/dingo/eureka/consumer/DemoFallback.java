package com.dingo.eureka.consumer;

import org.springframework.stereotype.Component;

import java.util.Hashtable;
import java.util.Map;

/**
 * @Description:
 * @Author: Dingo
 * @Version: 1.0
 * @date: 2019/2/21 14:35
 */
@Component
public class DemoFallback implements DemoServer{
    @Override
    public Map getUser(Integer id) {
        Map map = new Hashtable();
        map.put("id",999);
        map.put("from","too many user");
        return map;
    }
}
