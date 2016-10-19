/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import javax.swing.ImageIcon;

/**
 *
 * @author KillerCoffeBR
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        
        //Altera o icone no topo da janela
        
        this.setIconImage(new ImageIcon(getClass().getResource("/icones/car.png")).getImage());
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
        Btn_TelaCliente = new javax.swing.JButton();
        Btn_TelaAutos = new javax.swing.JButton();
        Btn_TelaVagas = new javax.swing.JButton();
        Btn_TelaNotaF1 = new javax.swing.JButton();
        Btn_TelaLocacao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btn_TelaPagamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROParking - Início");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

        Btn_TelaCliente.setText("Tela Cliente");
        Btn_TelaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaClienteActionPerformed(evt);
            }
        });

        Btn_TelaAutos.setText("Tela veículos");
        Btn_TelaAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaAutosActionPerformed(evt);
            }
        });

        Btn_TelaVagas.setText("Tela Vagas");
        Btn_TelaVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaVagasActionPerformed(evt);
            }
        });

        Btn_TelaNotaF1.setText("Tela Nota Fiscal");
        Btn_TelaNotaF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaNotaF1ActionPerformed(evt);
            }
        });

        Btn_TelaLocacao.setText("Tela Locação");
        Btn_TelaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaLocacaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Início");

        Btn_TelaPagamento.setText("Tela Pagamento");
        Btn_TelaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TelaPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_TelaAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_TelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_TelaNotaF1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_TelaLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_TelaVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_TelaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_TelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_TelaVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_TelaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_TelaNotaF1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_TelaAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_TelaLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_TelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaClienteActionPerformed
        // TODO add your handling code here:
        ClienteTela clitela;
        clitela = new ClienteTela();
        clitela.setVisible(true);
        clitela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_TelaClienteActionPerformed

    private void Btn_TelaAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaAutosActionPerformed
    AutomovelTela autotela;
    autotela = new  AutomovelTela();
    autotela.setVisible(true);
    autotela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_TelaAutosActionPerformed

    private void Btn_TelaVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaVagasActionPerformed
    VagasTela vagatela;
    vagatela = new  VagasTela();
    vagatela.setVisible(true);
    vagatela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_TelaVagasActionPerformed

    private void Btn_TelaNotaF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaNotaF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_TelaNotaF1ActionPerformed

    private void Btn_TelaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaLocacaoActionPerformed
        // TODO add your handling code here:
        LocacaoTela locacaotela;
        locacaotela = new LocacaoTela();
        locacaotela.setVisible(true);
        locacaotela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_TelaLocacaoActionPerformed

    private void Btn_TelaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TelaPagamentoActionPerformed
        PagamentoTela pagamento;
        pagamento = new  PagamentoTela();
        pagamento.setVisible(true);
        pagamento.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Btn_TelaPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_TelaAutos;
    private javax.swing.JButton Btn_TelaCliente;
    private javax.swing.JButton Btn_TelaLocacao;
    private javax.swing.JButton Btn_TelaNotaF1;
    private javax.swing.JButton Btn_TelaPagamento;
    private javax.swing.JButton Btn_TelaVagas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
