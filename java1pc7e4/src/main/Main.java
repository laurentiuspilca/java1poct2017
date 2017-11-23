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
    public static void main(String[] args) {
        MyRegistry r1 = MyRegistry.getInstance("A");
        MyRegistry r2 = MyRegistry.getInstance("B");
        MyRegistry r3 = MyRegistry.getInstance("A");
        
        System.out.println(r1 == r3); // true
        System.out.println(r1 == r2); // false
    }
}
