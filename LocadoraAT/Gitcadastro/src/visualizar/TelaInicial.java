/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizar;

import carros.DAO;
import carros.Veiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Giova
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCarros
     */
    private static DAO dao = new DAO();
    public TelaInicial() {
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

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnTipos = new javax.swing.JButton();
        btnCaro = new javax.swing.JButton();
        btnMedia = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Carros");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tela inicial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 3, 18))); // NOI18N
        jPanel1.setLayout(null);

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar veículo");
        btnCadastrar.setAlignmentX(0.3F);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(20, 100, 160, 50);

        btnTipos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTipos.setText("Pesquisar categorias");
        btnTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposActionPerformed(evt);
            }
        });
        jPanel1.add(btnTipos);
        btnTipos.setBounds(350, 160, 180, 50);

        btnCaro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCaro.setText("Pesquisar por valor");
        btnCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCaro);
        btnCaro.setBounds(180, 160, 170, 50);

        btnMedia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMedia.setText("Média de preços");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMedia);
        btnMedia.setBounds(20, 160, 160, 50);

        btnMostrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMostrar.setText("Alterar veículo");
        btnMostrar.setAlignmentX(0.3F);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar);
        btnMostrar.setBounds(180, 100, 170, 50);

        btnPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar veículo");
        btnPesquisar.setAlignmentX(0.3F);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(350, 100, 180, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 540, 280);

        setBounds(0, 0, 578, 368);
    }// </editor-fold>//GEN-END:initComponents
     //ArrayList
    ArrayList <Veiculos>carro = new ArrayList();
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        CadastroCarros cd = new CadastroCarros(dao);  
        cd.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        AlterarCarro at = new AlterarCarro(dao);
        at.setVisible(true);

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        // TODO add your handling code here:
       
       dao.calcularMediaValores();
       
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaroActionPerformed
        // TODO add your handling code here:
        MostrarCcaro mcc = new MostrarCcaro(dao);
        mcc.setVisible(true);
    }//GEN-LAST:event_btnCaroActionPerformed

    private void btnTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiposActionPerformed
        // TODO add your handling code here:
        TiposdeCarro tipos = new TiposdeCarro(dao);
        tipos.setVisible(true);
    }//GEN-LAST:event_btnTiposActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        PesquisarCarro pesq = new PesquisarCarro(dao);
        pesq.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCaro;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTipos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
