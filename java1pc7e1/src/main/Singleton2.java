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
public class Singleton2 {
    private Singleton2() {}
    
    private static final class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    
    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
