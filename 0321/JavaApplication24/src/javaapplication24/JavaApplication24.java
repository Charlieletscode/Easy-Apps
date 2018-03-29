/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


/**
 *
 * @author Charlie Chung
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTime = f.format(new Date());
        int hour = Integer.parseInt(utcTime.substring(0, 2));
        System.out.println(hour);
        if(hour > 15 && hour < 23){
            System.out.println("Me sleeping.....");
        }
    }
    
}
