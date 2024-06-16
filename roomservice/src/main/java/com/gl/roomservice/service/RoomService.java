package com.gl.roomservice.service;

import com.gl.roomservice.entity.Room;
import com.gl.roomservice.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    RoomRepository  roomRepository;


    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }


    public List<Room> getRoom() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(int rid) {
        return roomRepository.findById(rid);
    }
}
