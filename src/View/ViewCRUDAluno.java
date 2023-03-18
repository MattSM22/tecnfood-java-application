package View;

import DAO.AlunoDAO;
import Model.AlunoModel;
import java.awt.event.KeyEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Keymap;

public class ViewCRUDAluno extends javax.swing.JInternalFrame {

    AlunoDAO dao = new AlunoDAO();
    AlunoModel aluno = new AlunoModel();
    
    public ViewCRUDAluno() {
        initComponents();
    }
    
    public void clearAllFields(){
        txtRMAluno.setText("");
        txtNomeAluno.setText("");
        txtCursoAluno.setText("");
        txtModuloAluno.setText("");
        txtTurno.setText("");
    }
    
    public void createTableModel() {
        ArrayList<AlunoModel> list = dao.getAllData();
        DefaultTableModel tableModel = (DefaultTableModel) jtAluno.getModel();
        tableModel.setRowCount(0);

        for (AlunoModel alunoArray : list) {
            Object rowData[] = {
                    alunoArray.getRMAluno()     , 
                    alunoArray.getNomeAluno()   , 
                    alunoArray.getModuloAluno() , 
                    alunoArray.getCursoAluno()  , 
                    alunoArray.getTurnoAluno()  , 
            };
            tableModel.addRow(rowData);
        }
    }
    
    public void createTableModelByRMTyped(){
        aluno.setRMAluno(txtRMAluno.getText());
        ArrayList<AlunoModel> list = dao.refinedTableDataByRMOfStudent(aluno);
        DefaultTableModel tableModel = (DefaultTableModel) jtAluno.getModel();
        tableModel.setRowCount(0);

        for (AlunoModel alunoArray : list) {
            Object rowData[] = {
                    alunoArray.getRMAluno()     , 
                    alunoArray.getNomeAluno()   , 
                    alunoArray.getModuloAluno() , 
                    alunoArray.getCursoAluno()  , 
                    alunoArray.getTurnoAluno()  , 
            };
            tableModel.addRow(rowData);
        }
    }
    
    public void createTableModelByNameStudentTyped(KeyEvent key){
        if(key.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            aluno.setNomeAluno(txtNomeAluno.getText());
            ArrayList<AlunoModel> list = dao.refinedTableDataByNameOfStudent(aluno);
            DefaultTableModel tableModel = (DefaultTableModel) jtAluno.getModel();
            tableModel.setRowCount(0);

            for (AlunoModel alunoArray : list) {
                Object rowData[] = {
                        alunoArray.getRMAluno()     , 
                        alunoArray.getNomeAluno()   , 
                        alunoArray.getModuloAluno() , 
                        alunoArray.getCursoAluno()  , 
                        alunoArray.getTurnoAluno()  , 
                };
                tableModel.addRow(rowData);
            }
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAluno = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtRMAluno = new javax.swing.JTextField();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModuloAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCursoAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtTurno = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Consultar alunos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jtAluno.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jtAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RM do aluno", "Nome do aluno", "Modulo do aluno", "Curso do aluno", "Turno do aluno"
            }
        ));
        jtAluno.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jtAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAluno);

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel1.setText("RM do aluno:");

        txtRMAluno.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtRMAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRMAlunoKeyReleased(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRMAlunoKeyReleased(evt);
            }
        });

        txtNomeAluno.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeAlunoKeyReleased(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeAlunoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel2.setText("Nome do aluno:");

        txtModuloAluno.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel3.setText("Módulo do aluno:");

        txtCursoAluno.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setText(" Curso do aluno:");

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setText("Turno do aluno:");

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAlterar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar aluno");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnDeletar.setText("Deletar aluno");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtTurno.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRMAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModuloAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(txtCursoAluno))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRMAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtModuloAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        createTableModel();
    }//GEN-LAST:event_formComponentShown

    private void jtAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlunoMouseClicked
        int rowSelect = jtAluno.getSelectedRow();
        txtRMAluno.setText(jtAluno.getModel().getValueAt(rowSelect, 0).toString());
        txtNomeAluno.setText(jtAluno.getModel().getValueAt(rowSelect, 1).toString());
        txtModuloAluno.setText(jtAluno.getModel().getValueAt(rowSelect, 2).toString());
        txtCursoAluno.setText(jtAluno.getModel().getValueAt(rowSelect, 3).toString());
        txtTurno.setText(jtAluno.getModel().getValueAt(rowSelect, 4).toString());
    }//GEN-LAST:event_jtAlunoMouseClicked

    private void txtNomeAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAlunoKeyReleased
        createTableModelByNameStudentTyped(evt);
    }//GEN-LAST:event_txtNomeAlunoKeyReleased

    private void txtRMAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRMAlunoKeyReleased
        createTableModelByRMTyped();
    }//GEN-LAST:event_txtRMAlunoKeyReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int updateVerify = 0;
        
        aluno.setRMAluno(txtRMAluno.getText());
        aluno.setNomeAluno(txtNomeAluno.getText());
        aluno.setModuloAluno(txtModuloAluno.getText());
        aluno.setCursoAluno(txtCursoAluno.getText());
        aluno.setTurnoAluno(txtTurno.getText());
        
        updateVerify = dao.updateAluno(aluno);
        
        if(updateVerify > 0){
            JOptionPane.showMessageDialog(null, "Aluno atualizado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            createTableModel();
            clearAllFields();
       } else {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a atualização! Por revise os dados, se persistir entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int deletedStudentVerify;
        int confirma;
        if (txtRMAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Administrador requisitado para exclusão não possui ID ou está com o campo de ID vazio. Por favor selecione um usuário para exclusão na tabela ao lado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            
            confirma = JOptionPane.showConfirmDialog(null,
                    "Você realmente deseja excluir este Aluno?\n"
                    + "(está escolha é permanente, em caso de exclusão indesejada deverá ser criado "
                    + "novamente o aluno, ou então pedir para que o suporte realize novamente a inserção dos alunos pelo csv)", "Exclusão do aluno: "
                    + txtNomeAluno.getText().toUpperCase()
                    + " RM: " + txtRMAluno.getText(),
                    JOptionPane.YES_NO_OPTION);
            
            if (confirma == JOptionPane.YES_OPTION) {
                aluno.setRMAluno(txtRMAluno.getText());
                deletedStudentVerify = dao.deleteAluno(aluno);
                if (deletedStudentVerify > 0) {
                    JOptionPane.showMessageDialog(null, "Aluno excluido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    createTableModel();
                    clearAllFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel realizar a exclusão, tente novamente ou entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    clearAllFields();
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtAluno;
    private javax.swing.JTextField txtCursoAluno;
    private javax.swing.JTextField txtModuloAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtRMAluno;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
