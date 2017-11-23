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
public class CalculatorPatrat implements Calculator {

    private Calculator calculator;
    
    public CalculatorPatrat(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public int operatie(int x, int y) {
        int rez = calculator.operatie(x, y);
        return rez * rez;
    }
    
}
