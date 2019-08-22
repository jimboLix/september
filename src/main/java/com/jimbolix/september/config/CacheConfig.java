package com.jimbolix.september.config;

import com.jimbolix.september.util.JsonSerializationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
public class CacheConfig {
    Logger logger = LoggerFactory.getLogger(CacheConfig.class);

    @Bean
    public KeyGenerator septemKeyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName()).append("#");
                sb.append(method.getName()).append("#");
                for (Object o : objects){
                    try {
                        sb.append(JsonSerializationUtil.toJsonString(o));
                    } catch (Exception e) {
                        logger.error("KeyGenerator error"+e.getMessage());
                    }
                }
                return sb.toString();
            }
        };
    }
}
