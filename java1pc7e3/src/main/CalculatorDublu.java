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
public class CalculatorDublu implements Calculator {
    
    private Calculator calculator;
    
    public CalculatorDublu(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int operatie(int x, int y) {
        return calculator.operatie(x, y) * 2;
    }
    
}
