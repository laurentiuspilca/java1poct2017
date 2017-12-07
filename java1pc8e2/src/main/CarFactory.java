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
public abstract class CarFactory {
    public abstract Roata createRoata();
    public abstract Motor createMotor();
    
    public static CarFactory createCarFactory(Type tip) {
        switch (tip) {
            case AUDI: return new AudiFactory();
            case BMW: return new BMWFactory();
        }
        
        throw new RuntimeException();
    }
    
    public static enum Type {
        AUDI, BMW
    }
}
