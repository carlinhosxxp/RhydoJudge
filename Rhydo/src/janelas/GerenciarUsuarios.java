/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author carlosrorato
 */
public class GerenciarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarUsuarios
     */
    public GerenciarUsuarios() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuario.getModel();
        TabelaUsuario.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        opAdmin = new javax.swing.JRadioButton();
        opUser = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuario = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        spinnerScore = new javax.swing.JSpinner();
        spinnerTotalSub = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Usuários");

        jLabel1.setText("Login:");

        txtLogin.setToolTipText("Insira o nome de usuário");

        jLabel2.setText("Senha:");

        txtSenha.setToolTipText("Insira a senha");

        jLabel4.setText("Tipo de Usuário:");

        opAdmin.setText("Administrador");
        opAdmin.setToolTipText("Cadastrar como Administrador");
        opAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAdminActionPerformed(evt);
            }
        });

        opUser.setText("Usuário");
        opUser.setToolTipText("Cadastrar como Usuário");
        opUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUserActionPerformed(evt);
            }
        });

        jLabel5.setText("Score:");

        jLabel6.setText("Total de Submissões:");

        TabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Login", "Senha", "Tipo", "Score", "Total Subm."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaUsuario.setToolTipText("Tabela de Usuários");
        TabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaUsuario);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Cadastrar usuário");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir usuário selecionado");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("Atualizar usuário");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        spinnerScore.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTotalSub.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opAdmin)
                                        .addGap(18, 18, 18)
                                        .addComponent(opUser))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(3, 3, 3)
                                            .addComponent(spinnerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerTotalSub))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(4, 4, 4)
                                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opAdmin)
                    .addComponent(opUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(spinnerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerTotalSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO udao = new UsuarioDAO();

        for (Usuario u : udao.read()) {
            modelo.addRow(new Object[]{
                u.getId(), u.getLogin(), u.getSenha(), u.getTipo(), u.getScore(), u.getTotalSub()
            });
        }

    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Os campos de login e senha são obrigatórios!");
            return;
        }

        Usuario u = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        if ((Integer) spinnerScore.getValue() > (Integer) spinnerTotalSub.getValue()){
            JOptionPane.showMessageDialog(this, "O score deve ser menor ou igual ao total de submissões!");
        }
        else if ((opAdmin.isSelected() == true && opUser.isSelected() == true)||(opAdmin.isSelected() == false && opUser.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Escolha entre Usuário e Administrador!");
        } else if (dao.check(txtLogin.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Não é permitido cadastrar mais de um usuário com mesmo login!");
        } else {
            if (opAdmin.isSelected() == true) {
                u.setTipo(1);
            } else {
                u.setTipo(2);
            }
            u.setLogin(txtLogin.getText());
            u.setSenha(txtSenha.getText());
            u.setScore((Integer) spinnerScore.getValue());
            u.setTotalSub((Integer) spinnerTotalSub.getValue());

            dao.create(u);

            txtLogin.setText("");
            txtSenha.setText("");
            spinnerScore.setValue(0);
            spinnerTotalSub.setValue(0);
            opAdmin.setSelected(false);
            opUser.setSelected(false);

            readJTable();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void opAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAdminActionPerformed
        opUser.setSelected(false);
    }//GEN-LAST:event_opAdminActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (TabelaUsuario.getSelectedRow() != -1) {
            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            u.setId(Integer.parseInt(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 0).toString()));
            dao.delete(u);

            txtLogin.setText("");
            txtSenha.setText("");
            spinnerScore.setValue(0);
            spinnerTotalSub.setValue(0);
            opAdmin.setSelected(false);
            opUser.setSelected(false);

            readJTable();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void TabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaUsuarioMouseClicked
        if (TabelaUsuario.getSelectedRow() != -1) {
            txtLogin.setText(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 1).toString());
            txtSenha.setText(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 2).toString());
            spinnerScore.setValue(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 4));
            spinnerTotalSub.setValue(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 5));
            if (TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 3).equals(1)) {
                opAdmin.setSelected(true);
                opUser.setSelected(false);
            } else {
                opAdmin.setSelected(false);
                opUser.setSelected(true);
            }

        }
    }//GEN-LAST:event_TabelaUsuarioMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if ((Integer) spinnerScore.getValue() > (Integer) spinnerTotalSub.getValue()){
            JOptionPane.showMessageDialog(this, "O score deve ser menor ou igual ao total de submissões!");
            return;
        }
        
        if (TabelaUsuario.getSelectedRow() != -1) {
            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            u.setId(Integer.parseInt(TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 0).toString()));
            u.setLogin(txtLogin.getText());
            u.setSenha(txtSenha.getText());
            u.setScore((Integer) spinnerScore.getValue());
            u.setTotalSub((Integer) spinnerTotalSub.getValue());
            if (opAdmin.isSelected() == true) {
                u.setTipo(1);
            } else {
                u.setTipo(2);
            }

            dao.update(u);

            txtLogin.setText("");
            txtSenha.setText("");
            spinnerScore.setValue(0);
            spinnerTotalSub.setValue(0);
            opAdmin.setSelected(false);
            opUser.setSelected(false);

            readJTable();

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void opUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUserActionPerformed
        opAdmin.setSelected(false);
    }//GEN-LAST:event_opUserActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaUsuario;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opAdmin;
    private javax.swing.JRadioButton opUser;
    private javax.swing.JSpinner spinnerScore;
    private javax.swing.JSpinner spinnerTotalSub;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
