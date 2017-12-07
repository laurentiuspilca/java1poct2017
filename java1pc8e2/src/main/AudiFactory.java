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
public class AudiFactory extends CarFactory {

    @Override
    public Roata createRoata() {
        return new Roata("Audi");
    }

    @Override
    public Motor createMotor() {
        return new Motor("Audi");
    }
    
}
