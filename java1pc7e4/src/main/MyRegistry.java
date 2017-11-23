/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author student
 */
public class MyRegistry {
    
    private static final Map<String, MyRegistry> REGISTRY
            = new HashMap<>();
    
    private MyRegistry() {}
    
    public static MyRegistry getInstance(String key) {
        if (!REGISTRY.containsKey(key)) {
            REGISTRY.put(key, new MyRegistry());
        }
        
        return REGISTRY.get(key);
    }
}
