/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Optional;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty();
        
        Integer x = 10;
        
        Optional<Integer> o2 = Optional.ofNullable(x);
        Optional<Integer> o3 = Optional.of(x); // exceptie daca x este null
        
        Optional<String> o4 = myStringMeth();
        
        o4.ifPresent(System.out::println);
        
        if (o4.isPresent()) {
            String q = o4.get(); // deprecated
        }
        
        int size1 = o4.map(s -> s.length()).orElse(0);
        
        int size2 = o4.map(s -> s.length())
                .orElseThrow(RuntimeException::new);
                        // () -> new RuntimeException()
    }
    
    public static Optional<String> myStringMeth() {
        try {
            String x = "HELLO"; // obtin valoarea printr-o metoda care poate arunca exceptie
            return Optional.of(x);
        } catch (Exception e) {
            // do smth
        }
        
        return Optional.empty();
    }
    
}
