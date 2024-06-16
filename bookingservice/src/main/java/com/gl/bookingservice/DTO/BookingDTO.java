package com.gl.bookingservice.DTO;


public class BookingDTO {
    private int bid;
    private UsersDTO users;
    private RoomDTO room;

    public BookingDTO(int bid, UsersDTO users, RoomDTO room) {
        this.bid = bid;
        this.users = users;
        this.room = room;
    }
    public BookingDTO() {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bid=" + bid +
                ", users=" + users +
                ", room=" + room +
                '}';
    }
}
