/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationapp.model;

/**
 *
 * @author anya.f.collins
 */
public class Room {
     
    public static enum RoomType {
        //fixed list
        SINGLE,
        DOUBLE,
        TRIPLE,
        QUAD,
        KING,
        PENTHOUSE
    }
    
    public Room(RoomType roomType){
        //have to supply a roomtype to create a room
        setRoomInfo(roomType);
    }
    
    private RoomType roomType;
    private Double roomRate;
    private Double cardFee;
    private Double weekendRate;
    
    public RoomType getRoomType() {
        return roomType;
    }
    
     public Double getRoomRate() {
        return roomRate;
    }
     
    public void setRoomRate(Double roomRate) {
        this.roomRate = roomRate;
    }

    public Double getCardFee() {
        return cardFee;
    }

    public Double getWeekendRate() {
        return weekendRate;
    }
    
    private void setRoomInfo(RoomType roomType){
        
        switch(roomType)
        {
            case SINGLE:
                this.roomType = RoomType.SINGLE;
                this.roomRate = 50.0;
                this.cardFee = 1.80;
                this.weekendRate = 160.0;
                break;
            case DOUBLE:
                this.roomType = RoomType.DOUBLE;
                 this.roomRate = 80.0;
                this.cardFee = 1.80;
                this.weekendRate = 190.0;
                break;
            case TRIPLE:
                this.roomType = RoomType.TRIPLE;
                 this.roomRate = 70.0;
                this.cardFee = 1.80;
                this.weekendRate = 180.0;
                break;
            case QUAD:
                this.roomType = RoomType.QUAD;
                 this.roomRate = 160.0;
                this.cardFee = 1.80;
                this.weekendRate = 370.0;
                break;
            case KING:
                this.roomType = RoomType.KING;
                 this.roomRate = 90.0;
                this.cardFee = 2.0;
                this.weekendRate = 200.0;
                break;
            case PENTHOUSE:
                this.roomType = RoomType.PENTHOUSE;
                 this.roomRate = 100.0;
                this.cardFee = 4.40;
                this.weekendRate = 280.0;
                break;
        }
        
    }
}
