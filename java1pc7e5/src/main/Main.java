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
        MySubject s = new MySubject();
        
        s.addMyListener(() -> System.out.println("A"));
        s.addMyListener(() -> System.out.println("B"));
        s.addMyListener(() -> System.out.println("C"));
        
        s.oMetodaCareModificaCeva();
    }
}
