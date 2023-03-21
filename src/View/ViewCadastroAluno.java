package View;

import DAO.AlunoDAO;
import Model.AlunoModel;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ViewCadastroAluno extends javax.swing.JInternalFrame {
    
    AlunoDAO dao = new AlunoDAO();
    AlunoModel aluno = new AlunoModel();
    String uploadedFileFormated = "";
    
    public ViewCadastroAluno() {
        initComponents();
    }
    
    public void clearAllFields(){
        txtRMAluno.setText("");
        txtNomeAluno.setText("");
        txtCursoAluno.setText("");
        txtModuloAluno.setText("");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRMAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModuloAluno = new javax.swing.JTextField();
        txtCursoAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbTurnoAluno = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        btnCloseForm = new javax.swing.JButton();
        btnUploadFile = new javax.swing.JButton();
        lblReadedFile = new javax.swing.JLabel();
        btnCreateByCSV = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Cadastrar alunos");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de alunos no sistema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("RM do aluno:");

        txtRMAluno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Nome do aluno:");

        txtNomeAluno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Modulo do aluno:");

        txtModuloAluno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        txtCursoAluno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Curso do aluno:");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Turno do aluno:");

        jcbTurnoAluno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jcbTurnoAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        jcbTurnoAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCadastrar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar aluno");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnClearFields.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnClearFields.setText("Limpar campos");
        btnClearFields.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldsActionPerformed(evt);
            }
        });

        btnCloseForm.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCloseForm.setText("Fechar Formulário de cadastro");
        btnCloseForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCloseForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFormActionPerformed(evt);
            }
        });

        btnUploadFile.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnUploadFile.setText("Upload CSV de alunos");
        btnUploadFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        lblReadedFile.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N

        btnCreateByCSV.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnCreateByCSV.setText("Cadastrar pelo CSV");
        btnCreateByCSV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateByCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateByCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbTurnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtModuloAluno))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeAluno)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRMAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReadedFile)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCreateByCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRMAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateByCSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReadedFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModuloAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbTurnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        JFileChooser fileUpload = new JFileChooser();
        int resultFromDialog = fileUpload.showOpenDialog(null);
        if (resultFromDialog == JFileChooser.APPROVE_OPTION){
            File uploadedFile = new File(fileUpload.getSelectedFile().getAbsoluteFile().toString());
            uploadedFileFormated = uploadedFile.toString().replaceAll("\\\\", "/");
            lblReadedFile.setText(uploadedFileFormated);
        }
    }//GEN-LAST:event_btnUploadFileActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int adicionadoVerify;
        if (txtRMAluno.getText().isEmpty() || txtNomeAluno.getText().isEmpty() || txtModuloAluno.getText().isEmpty() || txtCursoAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos antes de realizar o cadastro do aluno.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            aluno.setRMAluno(txtRMAluno.getText());
            aluno.setNomeAluno(txtNomeAluno.getText().toUpperCase());
            aluno.setModuloAluno(txtModuloAluno.getText());
            aluno.setCursoAluno(txtCursoAluno.getText());
            aluno.setTurnoAluno(jcbTurnoAluno.getSelectedItem().toString());
            adicionadoVerify = dao.createAluno(aluno);
            
            if(adicionadoVerify > 0){
                JOptionPane.showMessageDialog(null, "Todos os alunos foram adicionados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                clearAllFields();
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a inserção do aluno! Por revise os campos digitados, se persistir entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCreateByCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateByCSVActionPerformed
        int adicionadoVerify;
        adicionadoVerify = dao.createAlunoFromCSV(uploadedFileFormated);
        if (adicionadoVerify > 0){
            JOptionPane.showMessageDialog(null, "Todos os alunos foram adicionados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            lblReadedFile.setText("");
            clearAllFields();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a inserção dos alunos! Por revise o arquivo enviado, se persistir entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
            lblReadedFile.setText("");
            clearAllFields();
        }
    }//GEN-LAST:event_btnCreateByCSVActionPerformed

    private void btnCloseFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFormActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseFormActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnClearFieldsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnCloseForm;
    private javax.swing.JButton btnCreateByCSV;
    private javax.swing.JButton btnUploadFile;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTurnoAluno;
    private javax.swing.JLabel lblReadedFile;
    private javax.swing.JTextField txtCursoAluno;
    private javax.swing.JTextField txtModuloAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtRMAluno;
    // End of variables declaration//GEN-END:variables
}
