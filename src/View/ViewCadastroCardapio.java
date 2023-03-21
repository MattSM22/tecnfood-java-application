/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import DAO.CardapioDAO;
import Model.CardapioModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Matheus
 */
public class ViewCadastroCardapio extends javax.swing.JInternalFrame {

    CardapioModel cardapio = new CardapioModel();
    CardapioDAO dao = new CardapioDAO();
    
    public ViewCadastroCardapio() {
        initComponents();
    }
    
    public void settingFormatingMask(){
        MaskFormatter maskData = null;
        try {
            maskData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(ViewCadastroCardapio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        maskData.install(txtData);
    }
    
    public void clearAllFields(){
        txtPratoBase.setText("");
        txtPratoPrincipal.setText("");
        txtGuarnicao.setText("");
        txtFrutaSalada.setText("");
        txtData.setText("");
        txtTotalCal.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPratoBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPratoPrincipal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGuarnicao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFrutaSalada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalCal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCadCardapio = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCloseForm = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Cadastro de cardapio");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de cardapio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Prato base:");

        txtPratoBase.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Prato principal:");

        txtPratoPrincipal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Guarnição:");

        txtGuarnicao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Fruta/Salada:");

        txtFrutaSalada.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Total de calorias:");

        txtTotalCal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Data da refeição");

        btnCadCardapio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCadCardapio.setText("Cadastrar cardapio");
        btnCadCardapio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCardapioActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnClear.setText("Limpar campos");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCloseForm.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCloseForm.setText("Fechar formulário");
        btnCloseForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCloseForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFormActionPerformed(evt);
            }
        });

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtData.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGuarnicao, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtPratoBase))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFrutaSalada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtPratoPrincipal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalCal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPratoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFrutaSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPratoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGuarnicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCardapioActionPerformed
        int flagAdicionado = 0;
        
        if (txtPratoBase.getText().isEmpty() || txtPratoPrincipal.getText().isEmpty() || 
            txtGuarnicao.getText().isEmpty() || txtTotalCal.getText().isEmpty() || 
            txtFrutaSalada.getText().isEmpty() || txtData.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de prosseguir com o cadastrado.");
        } else {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid.toString());
            System.out.println(Integer.parseInt(txtTotalCal.getText()));
            
            cardapio.setCod_cardapio(uuid.toString());
            cardapio.setPrato_base(txtPratoBase.getText());
            cardapio.setPrato_principal(txtPratoPrincipal.getText());
            cardapio.setGuarnição(txtGuarnicao.getText());
            cardapio.setFruta_salada(txtFrutaSalada.getText());
            cardapio.setTotal_cal(Integer.parseInt(txtTotalCal.getText()));
            cardapio.setDia_cardapio(txtData.getText());
            
            flagAdicionado = dao.createMenu(cardapio);
            if (flagAdicionado > 0){
                JOptionPane.showMessageDialog(null, "Refeição cadastrada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                clearAllFields();
                txtPratoBase.requestFocus();            
            }
        }
    }//GEN-LAST:event_btnCadCardapioActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        settingFormatingMask();
    }//GEN-LAST:event_formComponentShown

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFormActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCardapio;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCloseForm;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtFrutaSalada;
    private javax.swing.JTextField txtGuarnicao;
    private javax.swing.JTextField txtPratoBase;
    private javax.swing.JTextField txtPratoPrincipal;
    private javax.swing.JTextField txtTotalCal;
    // End of variables declaration//GEN-END:variables
}
