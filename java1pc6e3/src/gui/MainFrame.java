/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controllers.VehiculController;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Vehicul;

/**
 *
 * @author student
 */
public class MainFrame extends javax.swing.JFrame {
    
    private DefaultListModel<Vehicul> model = new DefaultListModel<>();

    public MainFrame() {
        initComponents();
        
        jList1.setModel(model);
        
        jMenuItem1.addActionListener(ev -> openAddFrame());
        VehiculController.getInstance().addVehiculListener(() -> afisareVehicule());
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void afisareVehicule() {
        model.clear();
        List<Vehicul> v = VehiculController.getInstance().getVehicule();
        v.forEach(model::addElement);
    }
    
    private void openAddFrame() {
        new AddVehiculFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<Vehicul>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jMenu1.setText("Optiuni");

        jMenuItem1.setText("Adauga vehicul");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Vehicul> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
