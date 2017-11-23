/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MySubject {
    
    private List<MyListener> listeners = new ArrayList<>();
    
    
    public void oMetodaCareModificaCeva() {
        // modificarea
        listeners.forEach(MyListener::notifiedMethod);
    }
    
    public void addMyListener(MyListener listener) {
        this.listeners.add(listener);
    }
    
    public void removeMyListener(MyListener listener) {
        this.listeners.remove(listener);
    }
}
