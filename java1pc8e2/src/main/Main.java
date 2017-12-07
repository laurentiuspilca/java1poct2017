/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarFactory f = 
            CarFactory.createCarFactory(CarFactory.Type.AUDI);
    
        Motor m = f.createMotor();
        Roata r = f.createRoata();
        
        System.out.println(m.getTip());
        System.out.println(r.getTip());
    }
    
}
