/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Locale;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        MyObject o =  new MyObject.Builder()
                .setW(10)
                .setZ(true)
                .build();
        
        Locale loc = new Locale.Builder()
                .setRegion("CA")
                .setLanguage("fr")
                .build();
    }
}
