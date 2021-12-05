package com.learningstuff.orderservice.constants;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by IntelliJ IDEA.
 * User: shamim
 * Date: ১৩/১২/১৯
 * Time: ৯:৫০ AM
 * Email: mdshamim723@gmail.com
 */

@Configuration
@PropertySource("classpath:application.properties")
@Getter
@ToString
public class UserServiceUrlConstant {

    public static String BASE_URL;

    @Value("${user-service}")
    public void setSecret(String baseUrl) {
        BASE_URL = baseUrl;
    }

}