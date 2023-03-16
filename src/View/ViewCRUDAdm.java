package View;

import DAO.AdmDAO;
import Model.AdmModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewCRUDAdm extends javax.swing.JInternalFrame {

    AdmDAO dao = new AdmDAO();
    AdmModel adm = new AdmModel();

    public ViewCRUDAdm() {
        initComponents();
    }

    public void clearAllFields() {
        txtIdUser.setText("");
        txtUser.setText("");
        txtPassword.setText("");
    }

    public void createTableModel() {
        ArrayList<AdmModel> list = dao.getAllData();
        DefaultTableModel tableModel = (DefaultTableModel) jtAdm.getModel();
        tableModel.setRowCount(0);

        for (AdmModel a : list) {
            Object rowData[] = {a.getId_adm(), a.getLogin_adm(), a.getSenha_adm()};
            tableModel.addRow(rowData);
        }

        System.out.println(tableModel.getRowCount());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCloseWindow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAdm = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de cadastro");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setText("Nome do usuário:");

        txtUser.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Senha do usuário:");

        txtPassword.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("ID do usuário:");

        txtIdUser.setEditable(false);
        txtIdUser.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtIdUser.setEnabled(false);

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnUpdate.setText("Alterar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCloseWindow.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnCloseWindow.setText("Fechar tela");
        btnCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseWindowActionPerformed(evt);
            }
        });

        jtAdm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtAdm.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jtAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código do Administrador", "Usuário do Administrador", "Senha do Administrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAdmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAdm);

        btnClear.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnClear.setText("Limpar");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnCloseWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCloseWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        createTableModel();
    }//GEN-LAST:event_formComponentShown

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseWindowActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseWindowActionPerformed

    private void jtAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAdmMouseClicked
        int rowSelect = jtAdm.getSelectedRow();
        txtIdUser.setText(jtAdm.getModel().getValueAt(rowSelect, 0).toString());
        txtUser.setText(jtAdm.getModel().getValueAt(rowSelect, 1).toString());
        txtPassword.setText(jtAdm.getModel().getValueAt(rowSelect, 2).toString());
    }//GEN-LAST:event_jtAdmMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int flagAtualizado = 0;
        if (txtIdUser.getText().isEmpty() || txtUser.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor os campos precisam estar preenchidos! Selecione algum usuário para atualização na tabela ao lado.", "Aviso", 0);
        } else {
            adm.setId_adm(Integer.parseInt(txtIdUser.getText()));
            adm.setLogin_adm(txtUser.getText());
            adm.setSenha_adm(txtPassword.getText());
            flagAtualizado = dao.admUpdate(adm);

            if (flagAtualizado > 0) {
                JOptionPane.showMessageDialog(null, "Administrador atualizado!", "Sucesso", 0);
                createTableModel();
                clearAllFields();
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a atualização! Por revise os dados, se persistir entre em contato com o suporte.", "Aviso", 0);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int usuarioApagado;
        int confirma;
        if (txtIdUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Administrador requisitado para exclusão não possui ID ou está com o campo de ID vazio. Por favor selecione um usuário para exclusão na tabela ao lado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            
            confirma = JOptionPane.showConfirmDialog(null,
                    "Você realmente deseja excluir esse administrador? "
                    + "(está escolha é permanente, em caso de exclusão indesejada deverá ser criado "
                    + "novamente o usuário)", "Exclusão do usuário: "
                    + txtUser.getText().toUpperCase(),
                    JOptionPane.YES_NO_OPTION);
            
            if (confirma == JOptionPane.YES_OPTION) {
                adm.setId_adm(Integer.parseInt(txtIdUser.getText()));
                usuarioApagado = dao.admDelete(adm);
                if (usuarioApagado > 0) {
                    JOptionPane.showMessageDialog(null, "Administrador excluido!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
                    createTableModel();
                    clearAllFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel realizar a exclusão, tente novamente ou entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    clearAllFields();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCloseWindow;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtAdm;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
