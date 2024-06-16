package com.gl.roomservice.controller;

import com.gl.roomservice.entity.Room;
import com.gl.roomservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {

    @Autowired
    RoomService  roomService;

    @PostMapping("/rooms")
    public Room createRoom(@RequestBody Room room)
    {
        return roomService.createRoom(room);
    }

    @GetMapping("/rooms")
    public List<Room> getRoom()
    {
        return roomService.getRoom();
    }

    @GetMapping("/rooms/{rid}")
    public Optional<Room> getRoomById(@PathVariable(name = "rid") int rid)
    {
        return roomService.getRoomById(rid);
    }
}
