/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationapp.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author anya.f.collinss
 */
public final class Constants {
    
    private Constants(){
        
    }
    
    public static final DateFormat standardDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static final DecimalFormat moneyFormat = new DecimalFormat("#0.00");
    
}
