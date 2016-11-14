/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ConexaoDB;
import controler.ControleCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModelCliente;
import model.ModelTable;

/**
 *
 * @author renato
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

       ModelCliente mod = new ModelCliente();
       ControleCliente control = new ControleCliente();
       
       ConexaoDB conecta = new ConexaoDB();
       int flag = 0;//caso o usuario tente salvar os mesmos dados
       
      public CadastroCliente() {
        initComponents();
        
          preencherTabela("select *from clientes order by nome_cliente");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtCadastroNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCadastroTelefone = new javax.swing.JTextField();
        jtCadastroEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaCliente = new javax.swing.JTable();
        jtPesqCliente = new javax.swing.JTextField();
        jbNovoCadastro = new javax.swing.JButton();
        jbEditarCadastro = new javax.swing.JButton();
        jbExcluirCadastro = new javax.swing.JButton();
        jbPesqCliente3 = new javax.swing.JButton();
        jbSalvarCadastro = new javax.swing.JButton();
        jbCancelarCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtIDCadastro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Cliente");
        setEnabled(false);
        setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 548));

        jtCadastroNome.setEnabled(false);
        jtCadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCadastroNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Telefone:");

        jtCadastroTelefone.setEnabled(false);
        jtCadastroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCadastroTelefoneActionPerformed(evt);
            }
        });

        jtCadastroEndereco.setEnabled(false);
        jtCadastroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCadastroEnderecoActionPerformed(evt);
            }
        });

        jTabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaCliente);

        jbNovoCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbNovoCadastro.setText("Novo Cadastro");
        jbNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoCadastroActionPerformed(evt);
            }
        });

        jbEditarCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbEditarCadastro.setText("Editar");
        jbEditarCadastro.setEnabled(false);
        jbEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarCadastroActionPerformed(evt);
            }
        });

        jbExcluirCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbExcluirCadastro.setText("Excluir");
        jbExcluirCadastro.setEnabled(false);
        jbExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirCadastroActionPerformed(evt);
            }
        });

        jbPesqCliente3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbPesqCliente3.setText("Pesquisar");
        jbPesqCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesqCliente3ActionPerformed(evt);
            }
        });

        jbSalvarCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbSalvarCadastro.setText("Salvar");
        jbSalvarCadastro.setEnabled(false);
        jbSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarCadastroActionPerformed(evt);
            }
        });

        jbCancelarCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jbCancelarCadastro.setText("Cancelar");
        jbCancelarCadastro.setEnabled(false);
        jbCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCadastroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("ID:");

        jtIDCadastro.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtIDCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jbPesqCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jtCadastroNome)
                    .addComponent(jtCadastroEndereco))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtIDCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtCadastroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesqCliente3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarCadastro)
                    .addComponent(jbNovoCadastro)
                    .addComponent(jbEditarCadastro)
                    .addComponent(jbExcluirCadastro)
                    .addComponent(jbCancelarCadastro))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCadastroNomeActionPerformed

        // deixa visivel as outras opções:
    }//GEN-LAST:event_jtCadastroNomeActionPerformed

    private void jtCadastroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCadastroTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCadastroTelefoneActionPerformed

    private void jtCadastroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCadastroEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCadastroEnderecoActionPerformed
   
    
    private void jbSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarCadastroActionPerformed

        
if(jtCadastroNome.getText().isEmpty()){

    JOptionPane.showMessageDialog(null, "Preencha o NOME para continuar");
    
    jtCadastroNome.requestFocus();//vai direto para nome
}else if(jtCadastroTelefone.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preencha o TELEFONE para continuar");
    
    jtCadastroNome.requestFocus(); //vai direto para telefone 

}else if(jtCadastroEndereco.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preencha o ENDEREÇO para continuar");
    
    jtCadastroEndereco.requestFocus();

}else       
        
if(flag == 1){//update com dados alterados
        mod.setNome(jtCadastroNome.getText());
        mod.setTelefone(Integer.parseInt(jtCadastroTelefone.getText()));
        mod.setEndereco(jtCadastroEndereco.getText());
        
        control.Salvar(mod);
       //limoa as areas de texto:
        jtCadastroNome.setText("");
        jtCadastroTelefone.setText("");
        jtCadastroEndereco.setText("");
        
        //bloqueia areas de texto:
        jtCadastroNome.setEnabled(false);
        jtCadastroTelefone.setEnabled(false);
        jtCadastroEndereco.setEnabled(false);
        jbSalvarCadastro.setEnabled(false);
        jbCancelarCadastro.setEnabled(false);
       
        preencherTabela("select *from clientes order by nome_cliente");
        
}else{
    mod.setCodigo((Integer.parseInt(jtIDCadastro.getText())));
    mod.setNome(jtCadastroNome.getText());
    mod.setTelefone(Integer.parseInt(jtCadastroTelefone.getText()));
    mod.setEndereco(jtCadastroEndereco.getText());
        
    control.Editar(mod);
    
    //limpar campos de texto
    jtIDCadastro.setText("");
    jtCadastroNome.setText("");
    jtCadastroTelefone.setText("");
    jtCadastroEndereco.setText("");
    jtPesqCliente.setText("");
    
        
        jtCadastroNome.setEnabled(false);
        jtCadastroTelefone.setEnabled(false);
        jtCadastroEndereco.setEnabled(false);
        jbSalvarCadastro.setEnabled(false);
        jbNovoCadastro.setEnabled(true);
        jbCancelarCadastro.setEnabled(false);
        
     preencherTabela("select *from clientes order by nome_cliente");
        
}

    }//GEN-LAST:event_jbSalvarCadastroActionPerformed

    private void jbNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoCadastroActionPerformed
        
        flag =1;
        
        jbSalvarCadastro.setEnabled(true);
       // jbEditarCadastro.setEnabled(true);
       // jbExcluirCadastro.setEnabled(true);
        jtCadastroNome.setEnabled(true);
        jtCadastroTelefone.setEnabled(true);
        jtCadastroEndereco.setEnabled(true);
        jbCancelarCadastro.setEnabled(true);
        
        jtIDCadastro.setText("");
        jtCadastroNome.setText("");
        jtCadastroTelefone.setText("");
        jtCadastroEndereco.setText("");
        jbCancelarCadastro.setText("");
        
        jbEditarCadastro.setEnabled(false);
        jbExcluirCadastro.setEnabled(false);
       // jbCancelarCadastro.setEnabled(true);
        jbPesqCliente3.setEnabled(false);
        jtPesqCliente.setEnabled(false);
        
           jtIDCadastro.setText("");
    jtCadastroNome.setText("");
    jtCadastroTelefone.setText("");
    jtCadastroEndereco.setText("");
    jtPesqCliente.setText("");
        
        
        
    }//GEN-LAST:event_jbNovoCadastroActionPerformed

    private void jbPesqCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesqCliente3ActionPerformed
      
        
        mod.setPesquisa(jtPesqCliente.getText());
        ModelCliente model = control.buscaCliente(mod);//envia por parametro o que o usuario digitou
        jtIDCadastro.setText(String.valueOf(model.getCodigo()));
        jtCadastroNome.setText(model.getNome());
        jtCadastroTelefone.setText(String.valueOf(model.getTelefone()));//tranforma inteiro em string;
        jtCadastroEndereco.setText(model.getEndereco());
         
      
        preencherTabela("select *from clientes where nome_cliente like'%" + mod.getPesquisa()+ "%'");
            
    }//GEN-LAST:event_jbPesqCliente3ActionPerformed

    private void jbCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCadastroActionPerformed
        jbSalvarCadastro.setEnabled(false);
        jbEditarCadastro.setEnabled(false);
        jbExcluirCadastro.setEnabled(false);
        jtCadastroNome.setEnabled(!true);
        jtCadastroTelefone.setEnabled(!true);
        jtCadastroEndereco.setEnabled(!true);
        jbCancelarCadastro.setEnabled(!true);
        jbNovoCadastro.setEnabled(true);
        
        jtPesqCliente.setEnabled(true);
        jbPesqCliente3.setEnabled(true);
        
           jtIDCadastro.setText("");
    jtCadastroNome.setText("");
    jtCadastroTelefone.setText("");
    jtCadastroEndereco.setText("");
    jtPesqCliente.setText("");
    }//GEN-LAST:event_jbCancelarCadastroActionPerformed

    private void jbEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarCadastroActionPerformed

        flag = 2;
        
        jbSalvarCadastro.setEnabled(true);
       jbEditarCadastro.setEnabled(false);
       jbExcluirCadastro.setEnabled(false);
       jbNovoCadastro.setEnabled(false);
        jtCadastroNome.setEnabled(true);
        jtCadastroTelefone.setEnabled(true);
        jtCadastroEndereco.setEnabled(true);
        jbCancelarCadastro.setEnabled(true);
    }//GEN-LAST:event_jbEditarCadastroActionPerformed

    private void jbExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirCadastroActionPerformed

        int resposta = 0;//guarda resposta do usuario
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente Excluir ?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jtIDCadastro.getText()));
            control.Excluir(mod);
       
        
         jtIDCadastro.setText("");
    jtCadastroNome.setText("");
    jtCadastroTelefone.setText("");
    jtCadastroEndereco.setText("");
    jtPesqCliente.setText("");
    
        
        jtCadastroNome.setEnabled(false);
        jtCadastroTelefone.setEnabled(false);
        jtCadastroEndereco.setEnabled(false);
        jbSalvarCadastro.setEnabled(false);
        jbNovoCadastro.setEnabled(true);
        jbCancelarCadastro.setEnabled(false);
        jbEditarCadastro.setEnabled(false);
        jbExcluirCadastro.setEnabled(false);
        
        preencherTabela("select *from clientes order by nome_cliente");
        }

       
    }//GEN-LAST:event_jbExcluirCadastroActionPerformed

    private void jTabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaClienteMouseClicked

         String nome_cliente ="" + jTabelaCliente.getValueAt(jTabelaCliente.getSelectedRow(), 1);//pega valores da tabela;
               conecta.conexao();
               conecta.executaSql("select *from clientes where nome_cliente='" + nome_cliente +"'");   
        
        try {
              
               conecta.rs.first();
               jtIDCadastro.setText(String.valueOf(conecta.rs.getInt("cod_cliente")));
               jtCadastroNome.setText(conecta.rs.getString("nome_cliente"));
               jtCadastroTelefone.setText(String.valueOf(conecta.rs.getInt("telefone_cliente")));
               jtCadastroEndereco.setText(conecta.rs.getString("endereco_cliente"));
               
               
               
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao selecionar dados" + ex);
           }

conecta.desconecta();
jbEditarCadastro.setEnabled(true);
jbExcluirCadastro.setEnabled(true);
jbCancelarCadastro.setEnabled(true);
jbSalvarCadastro.setEnabled(false);
jbNovoCadastro.setEnabled(false);

      
    }//GEN-LAST:event_jTabelaClienteMouseClicked

    public void preencherTabela(String Sql){
       ArrayList dados = new ArrayList();
       String [] colunas = new String []{"ID","Nome","Telefone","Endereço"};
        conecta.conexao();
        conecta.executaSql(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("cod_cliente"),conecta.rs.getString("nome_cliente"),conecta.rs.getInt("telefone_cliente"),conecta.rs.getString("endereco_cliente")});
            }while(conecta.rs.next());
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(rootPane,"Busque Novamente "); 
        }
        ModelTable modelo = new ModelTable(dados, colunas);
        jTabelaCliente.setModel(modelo);
        jTabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(28);
        jTabelaCliente.getColumnModel().getColumn(0).setResizable(false);//usuario n pode aumentar tamanho da coluna
        
        jTabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTabelaCliente.getColumnModel().getColumn(1).setResizable(false);//usuario n pode aumentar nome na coluna
       
        jTabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTabelaCliente.getColumnModel().getColumn(2).setResizable(false);//usuario n pode aumentar telefone da coluna
       
        jTabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(220);
        jTabelaCliente.getColumnModel().getColumn(3).setResizable(false);//usuario n pode aumentar endereco da coluna
       
        jTabelaCliente.getTableHeader().setReorderingAllowed(false);
        jTabelaCliente.setAutoResizeMode(jTabelaCliente.AUTO_RESIZE_OFF);//nao pode redimencionar tabela;
        
        jTabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona apenas um por vez na tabela
        
        
        conecta.desconecta();
        
    }
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaCliente;
    private javax.swing.JButton jbCancelarCadastro;
    private javax.swing.JButton jbEditarCadastro;
    private javax.swing.JButton jbExcluirCadastro;
    private javax.swing.JButton jbNovoCadastro;
    private javax.swing.JButton jbPesqCliente3;
    private javax.swing.JButton jbSalvarCadastro;
    private javax.swing.JTextField jtCadastroEndereco;
    private javax.swing.JTextField jtCadastroNome;
    private javax.swing.JTextField jtCadastroTelefone;
    private javax.swing.JTextField jtIDCadastro;
    private javax.swing.JTextField jtPesqCliente;
    // End of variables declaration//GEN-END:variables
}
