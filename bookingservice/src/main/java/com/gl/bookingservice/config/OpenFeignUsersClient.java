package com.gl.bookingservice.config;

import com.gl.bookingservice.DTO.UsersDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "APIGATEWAY",contextId = "usersclient")
public interface OpenFeignUsersClient {
    @GetMapping("/users/{userId}")
    UsersDTO getUser(@PathVariable  int userId);
}
