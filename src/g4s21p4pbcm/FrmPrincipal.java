/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p4pbcm;

/**
 *
 * @author megaybte
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpcontenido = new javax.swing.JPanel();
        menbar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Isuma = new javax.swing.JMenuItem();
        Iresta = new javax.swing.JMenuItem();
        Imultiplicacion = new javax.swing.JMenuItem();
        Idivision = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpcontenido.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout dpcontenidoLayout = new javax.swing.GroupLayout(dpcontenido);
        dpcontenido.setLayout(dpcontenidoLayout);
        dpcontenidoLayout.setHorizontalGroup(
            dpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        dpcontenidoLayout.setVerticalGroup(
            dpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        Isuma.setText("Suma");
        Isuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsumaActionPerformed(evt);
            }
        });
        jMenu1.add(Isuma);

        Iresta.setText("Resta");
        Iresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrestaActionPerformed(evt);
            }
        });
        jMenu1.add(Iresta);

        Imultiplicacion.setText("Multiplicacion");
        Imultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImultiplicacionActionPerformed(evt);
            }
        });
        jMenu1.add(Imultiplicacion);

        Idivision.setText("Division");
        Idivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdivisionActionPerformed(evt);
            }
        });
        jMenu1.add(Idivision);

        menbar.add(jMenu1);

        jMenu2.setText("Acerca de...");

        jMenuItem3.setText("Info.");
        jMenu2.add(jMenuItem3);

        menbar.add(jMenu2);

        setJMenuBar(menbar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpcontenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsumaActionPerformed
        // TODO add your handling code here:
        FrmSuma frmsuma = new FrmSuma();
        frmsuma.setVisible(true);
        dpcontenido.add(frmsuma);
    }//GEN-LAST:event_IsumaActionPerformed

    private void IrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrestaActionPerformed
        // TODO add your handling code here:
        FrmResta frmresta = new FrmResta();
        frmresta.setVisible(true);
        dpcontenido.add(frmresta);
    }//GEN-LAST:event_IrestaActionPerformed

    private void ImultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImultiplicacionActionPerformed
        // TODO add your handling code here:
        FrmMultiplicacion frmmultiplicacion = new FrmMultiplicacion();
        frmmultiplicacion.setVisible(true);
        dpcontenido.add(frmmultiplicacion);
    }//GEN-LAST:event_ImultiplicacionActionPerformed

    private void IdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdivisionActionPerformed
        // TODO add your handling code here:
        FrmDivision frmdivision = new FrmDivision();
        frmdivision.setVisible(true);
        dpcontenido.add(frmdivision);
    }//GEN-LAST:event_IdivisionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Idivision;
    private javax.swing.JMenuItem Imultiplicacion;
    private javax.swing.JMenuItem Iresta;
    private javax.swing.JMenuItem Isuma;
    private javax.swing.JPanel dpcontenido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menbar;
    // End of variables declaration//GEN-END:variables
}
