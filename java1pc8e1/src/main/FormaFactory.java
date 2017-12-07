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
public final class FormaFactory {
    private FormaFactory() {}
    
    public static Forma createForma(Type tip) {
        switch (tip) {
            case CERC : return new Cerc();
            case DREPTUNGHI : return new Dreptunghi();
        }
        
        throw new RuntimeException("Please provide a correct shape");
    }
    
    public static enum Type {
        CERC, DREPTUNGHI
    }
}
