package com.vector;

import org.springframework.stereotype.Component;

/**
 * Created by DCITS-cs on 2018/6/30.
 */
@Component
public class ApiServiceError implements ApiService  {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
