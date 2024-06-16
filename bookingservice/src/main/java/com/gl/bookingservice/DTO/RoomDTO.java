package com.gl.bookingservice.DTO;

 public class RoomDTO {
     private int rid;
    private String type;
    private int cost;

    public RoomDTO(int roomId, String type, int cost) {
        this.rid = roomId;
        this.type = type;
        this.cost = cost;
    }
    public RoomDTO() {
    }

     public int getRid() {
         return rid;
     }

     public void setRid(int rid) {
         this.rid = rid;
     }

     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "RoomDTO{" +
                "roomId=" + rid +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}
