package com.learningstuff.orderservice.dao;

import com.learningstuff.orderservice.constants.UserServiceUrlConstant;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩/১২/২১
 * Time: ৪:৪০ PM
 * Email: mdshamim723@gmail.com
 */

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate;

    @Override
    public String getBaseUrl() {

        try {
            ResponseEntity<String> response = restTemplate.exchange(UserServiceUrlConstant.BASE_URL, HttpMethod.GET, new HttpEntity<>(null), String.class);
            log.info("Successfully get user base url. status code: {} response: {}", response.getStatusCode(), response.getBody());
            return response.getBody();
        } catch (RestClientResponseException e) {
            log.error("Failed to get user base url. status code: {} error: {}", e.getRawStatusCode(), e.getMessage());
            return null;
        }

    }

}
