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
    
    public static void main(String [] args) {
        Calculator suma = new CalculatorSuma();
        Calculator dublu = new CalculatorDublu(suma);
        Calculator patrat = new CalculatorPatrat(dublu);
        
        
        System.out.println(patrat.operatie(2, 3));
    }
}
