/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import dao.VagaDAO;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelo.Vaga;

/**
 *
 * @author KillerCoffeBR
 */
public class VagasTela extends javax.swing.JFrame {
    
    private List<Vaga> lista;
   

    Integer posicao;
    VagaDAO vagadao = new VagaDAO();

 

    public void Atualizar() {

        
        List <Vaga> lista = new ArrayList<Vaga>();
        VagaDAO dao = new VagaDAO();
        lista = dao.listar();
        
        if (lista.get(0).isStatus() == true){
        
        quadrado1.setBackground(Color.red);
        
        
        }
        else{
            quadrado1.setBackground(Color.green);
            
        }
        
        if (lista.get(1).isStatus() == true){
        
        quadrado2.setBackground(Color.red);
        
        
        }
        else{
            quadrado2.setBackground(Color.green);
            
        }
        
        if (lista.get(2).isStatus() == true){
        
        quadrado3.setBackground(Color.red);
       
        
        }
        else{
            quadrado3.setBackground(Color.green);
            
        }
        
        if (lista.get(3).isStatus() == true){
        
        quadrado4.setBackground(Color.red);
        
        
        }
        else{
            quadrado4.setBackground(Color.green);
            
        }
        
        if (lista.get(4).isStatus() == true){
        
        quadrado5.setBackground(Color.red);
        
        
        }
        else{
            quadrado5.setBackground(Color.green);
            
        
        }if (lista.get(5).isStatus() == true){
        
        quadrado6.setBackground(Color.red);
        
        
        }
        else{
            quadrado6.setBackground(Color.green);
            
        
        }if (lista.get(6).isStatus() == true){
        
        quadrado7.setBackground(Color.red);
        
        
        }
        else{
            quadrado7.setBackground(Color.green);
            
        
        }if (lista.get(7).isStatus() == true){
        
        quadrado8.setBackground(Color.red);
        
        
        }
        else{
            quadrado8.setBackground(Color.green);
           
        
        }if (lista.get(8).isStatus() == true){
        
        quadrado9.setBackground(Color.red);
        
        
        }
        else{
            quadrado9.setBackground(Color.green);
            
        
        }if (lista.get(9).isStatus() == true){
        
        quadrado10.setBackground(Color.red);
        
        
        }
        else{
            quadrado10.setBackground(Color.green);
            
        }
    }
 public VagasTela() {
        
//Altera o icone no topo da janela
        this.setIconImage(new ImageIcon(getClass().getResource("/icones/car.png")).getImage());
        
        initComponents();
        List <Vaga> lista = new ArrayList<Vaga>();
        VagaDAO dao = new VagaDAO();
        lista = dao.listar();
        
        
        
        
        if (lista.get(0).isStatus() == true){
        
        quadrado1.setBackground(Color.red);
        
        
        }
        else{
            quadrado1.setBackground(Color.green);
            
        }
        
        if (lista.get(1).isStatus() == true){
        
        quadrado2.setBackground(Color.red);
        
        
        }
        else{
            quadrado2.setBackground(Color.green);
            
        }
        
        if (lista.get(2).isStatus() == true){
        
        quadrado3.setBackground(Color.red);
       
        
        }
        else{
            quadrado3.setBackground(Color.green);
            
        }
        
        if (lista.get(3).isStatus() == true){
        
        quadrado4.setBackground(Color.red);
        
        
        }
        else{
            quadrado4.setBackground(Color.green);
            
        }
        
        if (lista.get(4).isStatus() == true){
        
        quadrado5.setBackground(Color.red);
        
        
        }
        else{
            quadrado5.setBackground(Color.green);
            
        
        }if (lista.get(5).isStatus() == true){
        
        quadrado6.setBackground(Color.red);
        
        
        }
        else{
            quadrado6.setBackground(Color.green);
            
        
        }if (lista.get(6).isStatus() == true){
        
        quadrado7.setBackground(Color.red);
        
        
        }
        else{
            quadrado7.setBackground(Color.green);
            
        
        }if (lista.get(7).isStatus() == true){
        
        quadrado8.setBackground(Color.red);
        
        
        }
        else{
            quadrado8.setBackground(Color.green);
           
        
        }if (lista.get(8).isStatus() == true){
        
        quadrado9.setBackground(Color.red);
        
        
        }
        else{
            quadrado9.setBackground(Color.green);
            
        
        }if (lista.get(9).isStatus() == true){
        
        quadrado10.setBackground(Color.red);
        
        
        }
        else{
            quadrado10.setBackground(Color.green);
            
        }
        
        
              
        
        
        
    }
    /**
     * Creates new form VagasTela1
     */

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Atualizar = new javax.swing.JButton();
        vaga1 = new javax.swing.JLabel();
        vaga2 = new javax.swing.JLabel();
        vaga4 = new javax.swing.JLabel();
        vaga3 = new javax.swing.JLabel();
        vaga5 = new javax.swing.JLabel();
        quadrado1 = new javax.swing.JPanel();
        txtVaga1 = new javax.swing.JLabel();
        quadrado2 = new javax.swing.JPanel();
        txtVaga2 = new javax.swing.JLabel();
        quadrado4 = new javax.swing.JPanel();
        txtVaga4 = new javax.swing.JLabel();
        quadrado3 = new javax.swing.JPanel();
        txtVaga3 = new javax.swing.JLabel();
        quadrado5 = new javax.swing.JPanel();
        txtVaga5 = new javax.swing.JLabel();
        quadrado6 = new javax.swing.JPanel();
        txtVaga6 = new javax.swing.JLabel();
        vaga6 = new javax.swing.JLabel();
        quadrado7 = new javax.swing.JPanel();
        txtVaga7 = new javax.swing.JLabel();
        vaga7 = new javax.swing.JLabel();
        vaga8 = new javax.swing.JLabel();
        quadrado8 = new javax.swing.JPanel();
        txtVaga8 = new javax.swing.JLabel();
        quadrado9 = new javax.swing.JPanel();
        txtVaga9 = new javax.swing.JLabel();
        vaga9 = new javax.swing.JLabel();
        vaga10 = new javax.swing.JLabel();
        quadrado10 = new javax.swing.JPanel();
        txtVaga10 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROParking - Vagas");

        jPanel1.setMinimumSize(new java.awt.Dimension(608, 295));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Klavika Regular", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Verde:");

        jLabel4.setFont(new java.awt.Font("Klavika Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Vermelho:");

        jLabel1.setFont(new java.awt.Font("Klavika Regular", 3, 12)); // NOI18N
        jLabel1.setText("Livre");

        jLabel3.setFont(new java.awt.Font("Klavika Regular", 3, 12)); // NOI18N
        jLabel3.setText("Ocupado");

        btn_Atualizar.setText("Atualizar");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btn_Atualizar)
                .addGap(67, 67, 67)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btn_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 500, 20));

        vaga1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga1.setText("Vaga 1");
        jPanel1.add(vaga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        vaga2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga2.setText("Vaga 2");
        jPanel1.add(vaga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        vaga4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga4.setText("Vaga 4");
        jPanel1.add(vaga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        vaga3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga3.setText("Vaga 3");
        jPanel1.add(vaga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        vaga5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga5.setText("Vaga 5");
        jPanel1.add(vaga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        quadrado1.setBackground(new java.awt.Color(0, 0, 255));
        quadrado1.setPreferredSize(new java.awt.Dimension(59, 91));

        txtVaga1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga1.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga1.setText("01");

        javax.swing.GroupLayout quadrado1Layout = new javax.swing.GroupLayout(quadrado1);
        quadrado1.setLayout(quadrado1Layout);
        quadrado1Layout.setHorizontalGroup(
            quadrado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quadrado1Layout.setVerticalGroup(
            quadrado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVaga1)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        quadrado2.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga2.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga2.setText("02");

        javax.swing.GroupLayout quadrado2Layout = new javax.swing.GroupLayout(quadrado2);
        quadrado2.setLayout(quadrado2Layout);
        quadrado2Layout.setHorizontalGroup(
            quadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga2)
                .addGap(19, 19, 19))
        );
        quadrado2Layout.setVerticalGroup(
            quadrado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga2)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        quadrado4.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga4.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga4.setText("04");

        javax.swing.GroupLayout quadrado4Layout = new javax.swing.GroupLayout(quadrado4);
        quadrado4.setLayout(quadrado4Layout);
        quadrado4Layout.setHorizontalGroup(
            quadrado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga4)
                .addGap(19, 19, 19))
        );
        quadrado4Layout.setVerticalGroup(
            quadrado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga4)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        quadrado3.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga3.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga3.setText("03");

        javax.swing.GroupLayout quadrado3Layout = new javax.swing.GroupLayout(quadrado3);
        quadrado3.setLayout(quadrado3Layout);
        quadrado3Layout.setHorizontalGroup(
            quadrado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga3)
                .addGap(19, 19, 19))
        );
        quadrado3Layout.setVerticalGroup(
            quadrado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga3)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        quadrado5.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga5.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga5.setText("05");

        javax.swing.GroupLayout quadrado5Layout = new javax.swing.GroupLayout(quadrado5);
        quadrado5.setLayout(quadrado5Layout);
        quadrado5Layout.setHorizontalGroup(
            quadrado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga5)
                .addGap(19, 19, 19))
        );
        quadrado5Layout.setVerticalGroup(
            quadrado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga5)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        quadrado6.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga6.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga6.setText("06");

        javax.swing.GroupLayout quadrado6Layout = new javax.swing.GroupLayout(quadrado6);
        quadrado6.setLayout(quadrado6Layout);
        quadrado6Layout.setHorizontalGroup(
            quadrado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga6)
                .addGap(19, 19, 19))
        );
        quadrado6Layout.setVerticalGroup(
            quadrado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga6)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        vaga6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga6.setText("Vaga 6");
        jPanel1.add(vaga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        quadrado7.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga7.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga7.setText("07");

        javax.swing.GroupLayout quadrado7Layout = new javax.swing.GroupLayout(quadrado7);
        quadrado7.setLayout(quadrado7Layout);
        quadrado7Layout.setHorizontalGroup(
            quadrado7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrado7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtVaga7)
                .addGap(19, 19, 19))
        );
        quadrado7Layout.setVerticalGroup(
            quadrado7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrado7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtVaga7)
                .addGap(34, 34, 34))
        );

        jPanel1.add(quadrado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        vaga7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga7.setText("Vaga 7");
        jPanel1.add(vaga7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        vaga8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga8.setText("Vaga 8");
        jPanel1.add(vaga8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        quadrado8.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga8.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga8.setText("08");

        javax.swing.GroupLayout quadrado8Layout = new javax.swing.GroupLayout(quadrado8);
        quadrado8.setLayout(quadrado8Layout);
        quadrado8Layout.setHorizontalGroup(
            quadrado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(quadrado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        quadrado8Layout.setVerticalGroup(
            quadrado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(quadrado8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(quadrado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 91));

        quadrado9.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga9.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga9.setText("09");

        javax.swing.GroupLayout quadrado9Layout = new javax.swing.GroupLayout(quadrado9);
        quadrado9.setLayout(quadrado9Layout);
        quadrado9Layout.setHorizontalGroup(
            quadrado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(quadrado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        quadrado9Layout.setVerticalGroup(
            quadrado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(quadrado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(quadrado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        vaga9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga9.setText("Vaga 9");
        jPanel1.add(vaga9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        vaga10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vaga10.setText("Vaga 10");
        jPanel1.add(vaga10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        quadrado10.setBackground(new java.awt.Color(0, 0, 255));

        txtVaga10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVaga10.setForeground(new java.awt.Color(254, 254, 254));
        txtVaga10.setText("10");

        javax.swing.GroupLayout quadrado10Layout = new javax.swing.GroupLayout(quadrado10);
        quadrado10.setLayout(quadrado10Layout);
        quadrado10Layout.setHorizontalGroup(
            quadrado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(quadrado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        quadrado10Layout.setVerticalGroup(
            quadrado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(quadrado10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(quadrado10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtVaga10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(quadrado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vagas.jpg"))); // NOI18N
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        Atualizar();
    }//GEN-LAST:event_btn_AtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VagasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VagasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VagasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VagasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VagasTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel quadrado1;
    private javax.swing.JPanel quadrado10;
    private javax.swing.JPanel quadrado2;
    private javax.swing.JPanel quadrado3;
    private javax.swing.JPanel quadrado4;
    private javax.swing.JPanel quadrado5;
    private javax.swing.JPanel quadrado6;
    private javax.swing.JPanel quadrado7;
    private javax.swing.JPanel quadrado8;
    private javax.swing.JPanel quadrado9;
    private javax.swing.JLabel txtVaga1;
    private javax.swing.JLabel txtVaga10;
    private javax.swing.JLabel txtVaga2;
    private javax.swing.JLabel txtVaga3;
    private javax.swing.JLabel txtVaga4;
    private javax.swing.JLabel txtVaga5;
    private javax.swing.JLabel txtVaga6;
    private javax.swing.JLabel txtVaga7;
    private javax.swing.JLabel txtVaga8;
    private javax.swing.JLabel txtVaga9;
    private javax.swing.JLabel vaga1;
    private javax.swing.JLabel vaga10;
    private javax.swing.JLabel vaga2;
    private javax.swing.JLabel vaga3;
    private javax.swing.JLabel vaga4;
    private javax.swing.JLabel vaga5;
    private javax.swing.JLabel vaga6;
    private javax.swing.JLabel vaga7;
    private javax.swing.JLabel vaga8;
    private javax.swing.JLabel vaga9;
    // End of variables declaration//GEN-END:variables
}
