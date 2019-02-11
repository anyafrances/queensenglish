/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationapp.model;

import java.util.Calendar;

/**
 *
 * @author anya.f.collins
 */
public class BookingDetails {
    
    public BookingDetails(){
        
    }
    
    Calendar checkInDate;
    Calendar checkOutDate;
    long totalDays;
    Room roomDetails;
    Double totalCost;
    Double vatCost;
    Double stayCost;   

    public Calendar getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Calendar checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Calendar getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Calendar checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    public long getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(long totalDays) {
        this.totalDays = totalDays;
    }

     public Room getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(Room roomDetails) {
        this.roomDetails = roomDetails;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getVatCost() {
        return vatCost;
    }

    public void setVatCost(Double vatCost) {
        this.vatCost = vatCost;
    }

    public Double getStayCost() {
        return stayCost;
    }

    public void setStayCost(Double stayCost) {
        this.stayCost = stayCost;
    }
    
}
