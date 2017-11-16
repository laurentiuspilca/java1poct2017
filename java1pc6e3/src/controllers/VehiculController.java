/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.Vehicul;

/**
 *
 * @author student
 */
public class VehiculController {
    private static VehiculController SINGLETON;
    
    private List<Vehicul> vehicule;
    private List<VehiculListener> listeners;
    
    private VehiculController() {
        vehicule = new ArrayList<>();
        listeners = new ArrayList<>();
    }
    
    public static VehiculController getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new VehiculController();
        }
        return SINGLETON;
    }
    
    public void adaugaVehicul(Vehicul v) {
        vehicule.add(v);
        listeners.forEach(VehiculListener::vehiculAdaugat);
    }
    
    public List<Vehicul> getVehicule() {
        return this.vehicule;
    }
    
    public void addVehiculListener(VehiculListener v) {
        listeners.add(v);
    }
}
