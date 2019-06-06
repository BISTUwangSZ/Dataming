package cn.com.dataming.prediction.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 获取不同环境的域名
 */
@Configuration
@Component
@PropertySource(value = {"application.properties"})
public class Constants{

    @Value("${api.domain}")
    public static String domain;
}
