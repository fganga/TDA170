/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import vista.carrera.AgregarCarrera;
import vista.institucion.AgregarInstitucion;

/**
 *
 * @author fredy
 */
public class MenuPrincipal extends javax.swing.JFrame implements ActionListener, ItemListener {

    /**
     * Creates new form MenuPrincipal
     */
    //Declaramos variables de objeto para los elementos del menu
    //Objeto de la clase JMenuBar
    private JMenuBar menuBar;
    //Objetos de la clase JMenu
    private JMenu menuInstitucion, menuSede, menuCarrera,menuAlumno;
    //Objetos de la clase JMenuItem
    private JMenuItem itemAgregarInstitucion,itemListarInstituciones;
    private JMenuItem itemAgregarCarrera,itemListarCarreras;
    public MenuPrincipal() {
        initComponents();
        construirMenu();
    }
    /*
    Procedimiento para asociar elementos y construir menu
    */
    public void construirMenu(){
        //Instanciamos el menuBar
        menuBar = new JMenuBar();
        //Instanciamos los objetos de la clase JMenu
        menuInstitucion     = new JMenu("Institución");
        menuSede            = new JMenu("Sede");
        menuCarrera         = new JMenu("Carrera");
        menuAlumno          = new JMenu("Alumno");
        //Instanciamos los objetos de la clase JMenuItem
        //Institución
        itemAgregarInstitucion  = new JMenuItem("Agregar institución");
        itemListarInstituciones = new JMenuItem("Listar instituciones");
        //Agregamos un addActionListener para cada item
        itemAgregarInstitucion.addActionListener(this);
        itemListarInstituciones.addActionListener(this);
        //Carrera
        itemAgregarCarrera      = new JMenuItem("Agregar Carrera");
        itemListarCarreras      = new JMenuItem("Listar Carrera");
        //Agregamos un addActionLister para cada item del menu de carreras
        itemAgregarCarrera.addActionListener(this);
        itemListarCarreras.addActionListener(this);
        //Asociamos al menuBar los elementos de la clase menu
        menuBar.add(menuInstitucion);
        menuBar.add(menuSede);
        menuBar.add(menuCarrera);
        menuBar.add(menuAlumno);
        //Asociamos a los menu sus respectivos items
        //Institución
        menuInstitucion.add(itemAgregarInstitucion);
        menuInstitucion.add(itemListarInstituciones);
        
        //Carrera
        menuCarrera.add(itemAgregarCarrera);
        menuCarrera.add(itemListarCarreras);
        
        //Establecemos la barra de menus para este JFrameForm
        this.setJMenuBar(menuBar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //Ejecutamos las acciones cuando seleccionamos un item del menu
       if(e.getSource() == itemAgregarInstitucion){
           //Iniciamos el JFrameForm para agregar institucion
           AgregarInstitucion agregarInstitucion = new AgregarInstitucion();
           agregarInstitucion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           agregarInstitucion.setVisible(true);
       }
        if(e.getSource() == itemAgregarCarrera){
           //Iniciamos el JFrameForm para agregar carrera
           AgregarCarrera agregarCarrera= new AgregarCarrera();
           agregarCarrera.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           agregarCarrera.setVisible(true);
       }
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
