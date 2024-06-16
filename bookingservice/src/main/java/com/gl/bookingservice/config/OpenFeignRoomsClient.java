package com.gl.bookingservice.config;

import com.gl.bookingservice.DTO.RoomDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "APIGATEWAY" ,contextId = "roomsclient")
public interface OpenFeignRoomsClient {
    @GetMapping("/rooms/{roomId}")
    RoomDTO getRoom(@PathVariable int roomId);
}
