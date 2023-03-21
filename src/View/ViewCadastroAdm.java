package View;

import DAO.AdmDAO;
import Model.AdmModel;
import javax.swing.JOptionPane;

public class ViewCadastroAdm extends javax.swing.JInternalFrame {
    
    AdmModel adm = new AdmModel();
    AdmDAO dao = new AdmDAO();
    
    public ViewCadastroAdm() {
        initComponents();  
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAdmNewPassword = new javax.swing.JTextField();
        btnCadAdm = new javax.swing.JButton();
        btnFecharForm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdmNewUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Cadastro de Administradores");

        txtAdmNewPassword.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        btnCadAdm.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCadAdm.setText("Cadastrar Administrador");
        btnCadAdm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAdmActionPerformed(evt);
            }
        });

        btnFecharForm.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnFecharForm.setText("Fechar Formulário");
        btnFecharForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFecharForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharFormActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Administradores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Digite o login do usuário:");

        txtAdmNewUser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Digite a senha do usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdmNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtAdmNewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(btnFecharForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdmNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharForm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAdmActionPerformed
        int flagAdicionado = 0;
        
        if (txtAdmNewUser.getText().isEmpty() || txtAdmNewPassword.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de prosseguir com o cadastrado.");
        } else {
            adm.setLogin_adm(txtAdmNewUser.getText());
            adm.setSenha_adm(txtAdmNewPassword.getText());
            flagAdicionado = dao.admCreate(adm);
            if (flagAdicionado > 0){
                txtAdmNewUser.setText("");
                txtAdmNewUser.requestFocus();
                txtAdmNewPassword.setText("");             
            }
        }
    }//GEN-LAST:event_btnCadAdmActionPerformed

    private void btnFecharFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharFormActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharFormActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAdm;
    private javax.swing.JButton btnFecharForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdmNewPassword;
    private javax.swing.JTextField txtAdmNewUser;
    // End of variables declaration//GEN-END:variables
}
