/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import DAO.CardapioDAO;
import Model.CardapioModel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Matheus
 */
public class ViewCRUDCardapio extends javax.swing.JInternalFrame {
    
    CardapioDAO dao = new CardapioDAO();
    CardapioModel cardapio = new CardapioModel();
    
    public ViewCRUDCardapio() {
        initComponents();
    }

    public void clearAllFields(){
        txtCodigo.setText("");
        txtPratoBase.setText("");
        txtPratoPrincipal.setText("");
        txtGuarnicao.setText("");
        txtFrutaSalada.setText("");
        txtData.setText("");
        txtCalorias.setText("");
    }
    
    public void createTableModelWithEvtListener() {
        cardapio.setDia_cardapio(txtData.getText());
        ArrayList<CardapioModel> list = dao.getMenuWithDate(cardapio);
        DefaultTableModel tableModel = (DefaultTableModel) jtCardapio.getModel();
        tableModel.setRowCount(0);

        for (CardapioModel cardapioArray : list) {
            Object rowData[] = {
                cardapioArray.getCod_cardapio()     ,
                cardapioArray.getPrato_base()       ,
                cardapioArray.getPrato_principal()  ,
                cardapioArray.getGuarnição()        ,
                cardapioArray.getFruta_salada()     ,
                cardapioArray.getTotal_cal()        ,
                cardapioArray.getDia_cardapio()     ,
            };
            tableModel.addRow(rowData);
        }
    }
    
    public void createTableModel() {
        ArrayList<CardapioModel> list = dao.getAllMenuData();
        DefaultTableModel tableModel = (DefaultTableModel) jtCardapio.getModel();
        tableModel.setRowCount(0);

        for (CardapioModel cardapioArray : list) {
            Object rowData[] = {
                cardapioArray.getCod_cardapio()     ,
                cardapioArray.getPrato_base()       ,
                cardapioArray.getPrato_principal()  ,
                cardapioArray.getGuarnição()        ,
                cardapioArray.getFruta_salada()     ,
                cardapioArray.getTotal_cal()        ,
                cardapioArray.getDia_cardapio()     ,
            };
            tableModel.addRow(rowData);
        }
    }

    public void settingFormatingMask() {
        MaskFormatter maskData = null;
        try {
            maskData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(ViewCadastroCardapio.class.getName()).log(Level.SEVERE, null, ex);
        }

        maskData.install(txtData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCardapio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPratoBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPratoPrincipal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGuarnicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFrutaSalada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCalorias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consultar cardapio");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtCardapio.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jtCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código de cardápio", "Prato base", "Prato principal", "Guarnição", "Fruta / Salada", "Total de calorias", "Data da refeição"
            }
        ));
        jtCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCardapioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCardapio);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setText("Prato base:");

        txtPratoBase.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtPratoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPratoBaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setText("Prato principal:");

        txtPratoPrincipal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtPratoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPratoPrincipalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setText("Guarnição:");

        txtGuarnicao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtGuarnicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuarnicaoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setText("Fruta / Salada:");

        txtFrutaSalada.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFrutaSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFrutaSaladaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel6.setText("Total de calorias:");

        txtCalorias.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaloriasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel7.setText("Data da refeição:");

        txtData.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
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

        btnFechar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnFechar.setText("Fechar formulário de consulta");
        btnFechar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFrutaSalada)
                            .addComponent(txtGuarnicao)
                            .addComponent(txtPratoPrincipal)
                            .addComponent(txtPratoBase)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo)
                            .addComponent(txtCalorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPratoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPratoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGuarnicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFrutaSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPratoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPratoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPratoBaseActionPerformed

    private void txtPratoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPratoPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPratoPrincipalActionPerformed

    private void txtGuarnicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuarnicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuarnicaoActionPerformed

    private void txtFrutaSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFrutaSaladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrutaSaladaActionPerformed

    private void txtCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaloriasActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        settingFormatingMask();
        createTableModel();
    }//GEN-LAST:event_formComponentShown

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        createTableModelWithEvtListener();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int deletedStudentVerify;
        int confirma;
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cardápio requisitado para exclusão não possui ID ou está com o campo de ID vazio. Por favor selecione um usuário para exclusão na tabela ao lado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            
            confirma = JOptionPane.showConfirmDialog(null,
                    "Você realmente deseja excluir este Cardápio?\n"
                    + "(está escolha é permanente, em caso de exclusão indesejada deverá ser criado "
                    + "novamente o cardápio, ou então pedir para que o suporte realize novamente a inserção dos alunos pelo csv)", "Exclusão do cardápio do dia: "
                    + txtData.getText(),JOptionPane.YES_NO_OPTION);
            
            if (confirma == JOptionPane.YES_OPTION) {
                cardapio.setCod_cardapio(txtCodigo.getText());
                deletedStudentVerify = dao.deleteMenu(cardapio);
                if (deletedStudentVerify > 0) {
                    JOptionPane.showMessageDialog(null, "Cardápio excluido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    createTableModel();
                    clearAllFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel realizar a exclusão, tente novamente ou entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    clearAllFields();
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int updateVerify = 0;
        
        cardapio.setPrato_base(txtPratoBase.getText());
        cardapio.setPrato_principal(txtPratoPrincipal.getText());
        cardapio.setGuarnição(txtGuarnicao.getText());
        cardapio.setFruta_salada(txtFrutaSalada.getText());
        cardapio.setTotal_cal(Integer.parseInt(txtCalorias.getText()));
        cardapio.setDia_cardapio(txtData.getText());
        
        updateVerify = dao.updateMenu(cardapio);
        
        if(updateVerify > 0){
            JOptionPane.showMessageDialog(null, "Cardápio atualizado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            createTableModel();
            clearAllFields();
       } else {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro durante a atualização! Por revise os dados, se persistir entre em contato com o suporte.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jtCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCardapioMouseClicked
        int rowSelect = jtCardapio.getSelectedRow();
        txtCodigo.setText(jtCardapio.getModel().getValueAt(rowSelect, 0).toString());
        txtPratoBase.setText(jtCardapio.getModel().getValueAt(rowSelect, 1).toString());
        txtPratoPrincipal.setText(jtCardapio.getModel().getValueAt(rowSelect, 2).toString());
        txtGuarnicao.setText(jtCardapio.getModel().getValueAt(rowSelect, 3).toString());
        txtFrutaSalada.setText(jtCardapio.getModel().getValueAt(rowSelect, 4).toString());
        txtCalorias.setText(jtCardapio.getModel().getValueAt(rowSelect, 5).toString());
        txtData.setText(jtCardapio.getModel().getValueAt(rowSelect, 6).toString());
    }//GEN-LAST:event_jtCardapioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtCardapio;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtFrutaSalada;
    private javax.swing.JTextField txtGuarnicao;
    private javax.swing.JTextField txtPratoBase;
    private javax.swing.JTextField txtPratoPrincipal;
    // End of variables declaration//GEN-END:variables
}
