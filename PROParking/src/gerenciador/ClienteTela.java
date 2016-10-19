/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import javax.swing.JOptionPane;
import dao.ClienteDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Cliente;
/**
 *
 * @author KillerCoffeBR
 */
public class ClienteTela extends javax.swing.JFrame {

    /**
     * Creates new form Automovel
     */
        private List<Cliente> lista;
        Integer posicao;
        
        public void Limpar ()
    {
        txt_Cpf.setText("");
        txt_Bonus.setText("");
        txt_Id.setText("");
        txt_Nome.setText("");
        txt_Rg.setText("");
        txt_Telefone.setText("");
    }
        
        public void Atualizar() {
        ClienteDAO dao = new ClienteDAO();

        lista = dao.listar();      
        posicao = 0;
    }
    public ClienteTela() {
        
        //Altera o icone no topo da janela
        this.setIconImage(new ImageIcon(getClass().getResource("/icones/car.png")).getImage());
        
        initComponents();
        ClienteDAO dao = new ClienteDAO();
        lista = dao.listar();
        
        posicao = 0;        
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
        BtnExcluir = new javax.swing.JButton();
        BtnPesquisar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Cpf = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_Rg = new javax.swing.JTextField();
        txt_Bonus = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROParking - Cliente");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        BtnExcluir.setContentAreaFilled(false);
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 70, 70));

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        BtnPesquisar.setContentAreaFilled(false);
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 70, 70));

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/aceitar.png"))); // NOI18N
        BtnSalvar.setContentAreaFilled(false);
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 70, 70));

        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo.png"))); // NOI18N
        BtnLimpar.setToolTipText("");
        BtnLimpar.setBorderPainted(false);
        BtnLimpar.setContentAreaFilled(false);
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 80, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CPF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 61, 53, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("RG:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 107, 53, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Telefone:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 153, 79, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 61, 53, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Id:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 153, 53, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bonus:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 107, 61, 28));

        txt_Cpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CpfActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 68, 155, -1));
        jPanel1.add(txt_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 160, 155, -1));
        jPanel1.add(txt_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 155, -1));
        jPanel1.add(txt_Rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 114, 155, -1));

        txt_Bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BonusActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 155, -1));

        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 155, -1));

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/20-News-808x455.jpg"))); // NOI18N
        fundo.setName(""); // NOI18N
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CpfActionPerformed
        // TODO add your handling code here:
        
            Cliente cliente = new Cliente();
    }//GEN-LAST:event_txt_CpfActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        {
            Atualizar();
            Cliente cliente = new Cliente();

            if (txt_Rg.getText().isEmpty() || txt_Cpf.getText().isEmpty() || txt_Telefone.getText().isEmpty() || txt_Nome.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Preencher todos os campos!");
            }
            else
            {
                cliente.setCpf(txt_Cpf.getText());
                cliente.setRg(txt_Rg.getText());
                cliente.setTelefone(txt_Telefone.getText());
                cliente.setNome(txt_Nome.getText());

                ClienteDAO dao = new ClienteDAO();
                Boolean deucerto = dao.inserir(cliente);

                if (deucerto == true)
                {
                    JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado com sucesso");

                    txt_Nome.setText("");
                    txt_Cpf.setText("");

                    txt_Telefone.setText("");
                    txt_Rg.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar Cliente!");
                }

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        Atualizar();
        Boolean encontrou = false;
        Integer posicaoachou = 0;

        for (Cliente lista1 : lista)
        {
            if (txt_Cpf.getText().equals(lista1.getCpf()))
            {
                encontrou = true;

                txt_Nome.setText(lista1.getNome());
                txt_Rg.setText(lista1.getRg());
                txt_Telefone.setText(lista1.getTelefone());
                txt_Id.setText(lista1.getId().toString());
                //Testa se o cliente contem algum valor acumulado no bonus e se tiver, ele exibe
                if (lista1.getBonusacumulado() != null){
                    txt_Bonus.setText(lista1.getBonusacumulado().toString());
                }
                 break;
            }
 
        }

        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Cliente ainda não cadastrado!");
        }
         
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void txt_BonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BonusActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
       if (txt_Cpf.getText().isEmpty() == false) {
            //instanciando a classe de acesso a dados JogadorDAO       
            ClienteDAO dao = new ClienteDAO();

            //chamo o inserir
            boolean deucerto = dao.remover(lista.get(posicao + 1));

            if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!");
            }
            String cpf = null;
            lista = dao.listarporcpf(cpf);
            Limpar();
        } else {

        }
        Atualizar();
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        Limpar();
        JOptionPane.showMessageDialog(rootPane, "A tela foi limpa com sucesso!"); 
    }//GEN-LAST:event_BtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteTela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Bonus;
    private javax.swing.JTextField txt_Cpf;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Rg;
    private javax.swing.JTextField txt_Telefone;
    // End of variables declaration//GEN-END:variables
}
