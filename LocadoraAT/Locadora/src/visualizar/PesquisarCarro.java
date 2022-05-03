package visualizar;

import carros.DAO;
import carros.Veiculos;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisarCarro extends javax.swing.JFrame {
    Veiculos veiculos = new Veiculos();
    DAO dao;
    /**
     * Creates new form CadastroCarros
     */
    public PesquisarCarro(DAO dao1) {
        this.dao = dao1;
        initComponents();
        alimentaComboBox();
    }

    private void alimentaComboBox(){
          ArrayList<Veiculos> list = dao.getArrayList();
          for(Veiculos item: list){
              String cod = String.valueOf(item.getCodVeiculo());
               CaixaCD.addItem(cod);
          }
    }
    
    public PesquisarCarro() {
        
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
        lblCD = new javax.swing.JLabel();
        lblNV = new javax.swing.JLabel();
        txtNomeVeiculo = new javax.swing.JTextField();
        jlbMV = new javax.swing.JLabel();
        TipoVeiculo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ValorVeiculo = new javax.swing.JTextField();
        AnoVeiculo = new javax.swing.JTextField();
        CaixaCD = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        MarcaVeiculo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 3, 18))); // NOI18N
        jPanel1.setLayout(null);

        lblCD.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        lblCD.setText("Código do Veículo:");
        jPanel1.add(lblCD);
        lblCD.setBounds(20, 80, 140, 20);

        lblNV.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        lblNV.setText("Nome do Veículo:");
        jPanel1.add(lblNV);
        lblNV.setBounds(30, 120, 130, 30);

        txtNomeVeiculo.setEditable(false);
        txtNomeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomeVeiculo);
        txtNomeVeiculo.setBounds(160, 120, 230, 30);

        jlbMV.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jlbMV.setText("Marca do Veículo:");
        jPanel1.add(jlbMV);
        jlbMV.setBounds(30, 160, 130, 30);

        TipoVeiculo.setEditable(false);
        jPanel1.add(TipoVeiculo);
        TipoVeiculo.setBounds(160, 200, 230, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Tipo do Veículo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 200, 120, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Valor do Veículo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 240, 130, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Ano do Veículo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 280, 120, 30);

        ValorVeiculo.setEditable(false);
        jPanel1.add(ValorVeiculo);
        ValorVeiculo.setBounds(160, 240, 230, 30);

        AnoVeiculo.setEditable(false);
        jPanel1.add(AnoVeiculo);
        AnoVeiculo.setBounds(160, 280, 230, 30);

        CaixaCD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Informe o Código>" }));
        CaixaCD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CaixaCDItemStateChanged(evt);
            }
        });
        CaixaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaCDActionPerformed(evt);
            }
        });
        jPanel1.add(CaixaCD);
        CaixaCD.setBounds(160, 70, 170, 40);

        btnPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setAlignmentX(0.3F);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(370, 70, 110, 27);

        MarcaVeiculo.setEditable(false);
        jPanel1.add(MarcaVeiculo);
        MarcaVeiculo.setBounds(160, 160, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 510, 340);

        setBounds(0, 0, 564, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeVeiculoActionPerformed
     //ArrayList
    
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if(CaixaCD.getSelectedItem().equals("<Código do Veículo>")){
            JOptionPane.showMessageDialog(null,"Opção errada, escolha uma das opções abaixo !", null, WIDTH);
        }else{
            veiculos = dao.pesquisarVeiculo(CaixaCD.getSelectedIndex()-1);
            
            txtNomeVeiculo.setText(veiculos.getNomeVeiculo());
            TipoVeiculo.setText(veiculos.getTipoVeiculo());
            MarcaVeiculo.setText(veiculos.getMarcaVeiculo());
            ValorVeiculo.setText(String.valueOf(veiculos.getValorVeiculo()));
            AnoVeiculo.setText(String.valueOf(veiculos.getAnoVeiculo()));
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void CaixaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaCDActionPerformed

    private void CaixaCDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CaixaCDItemStateChanged
        // TODO add your handling code here:   
        
    }//GEN-LAST:event_CaixaCDItemStateChanged
   
             
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
            java.util.logging.Logger.getLogger(PesquisarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarCarro().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoVeiculo;
    private javax.swing.JComboBox<String> CaixaCD;
    private javax.swing.JTextField MarcaVeiculo;
    private javax.swing.JTextField TipoVeiculo;
    private javax.swing.JTextField ValorVeiculo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbMV;
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblNV;
    private javax.swing.JTextField txtNomeVeiculo;
    // End of variables declaration//GEN-END:variables
}
