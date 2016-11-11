/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelCliente;

/**
 *
 * @author renato
 */
public class ControleCliente {

    ConexaoDB conecta = new ConexaoDB();
    ModelCliente mod = new ModelCliente();
   
    public void Salvar(ModelCliente mod){
         conecta.conexao();
        try {
           
            PreparedStatement pst = conecta.conect.prepareStatement("insert into clientes(nome_cliente,telefone_cliente,endereco_cliente) values(?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getTelefone());
            pst.setString(3, mod.getEndereco());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Dados:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }
  
    
    public void Editar(ModelCliente mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update clientes set nome_cliente=?,telefone_cliente=?,endereco_cliente=? where cod_cliente=?");
        pst.setString(1, mod.getNome());
         pst.setInt(2, mod.getTelefone());
          pst.setString(3, mod.getEndereco());
           pst.setInt(4, mod.getCodigo());
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
    
    
    public void Excluir(ModelCliente mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("delete from clientes where cod_cliente=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso\n" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Dados:\n" + ex.getMessage());
        }
        
        
        
        conecta.desconecta();
    }  
    
    
    
    
    
    
    public ModelCliente buscaCliente(ModelCliente mod){
        
        
            conecta.conexao();
            conecta.executaSql("select *from clientes where nome_cliente like'%" + mod.getPesquisa()+ "%'");
           
            try{
            
            conecta.rs.first();
            mod.setCodigo(conecta.rs.getInt("cod_cliente"));
            mod.setNome(conecta.rs.getString("nome_cliente"));
            mod.setTelefone(conecta.rs.getInt("telefone_cliente"));
            mod.setEndereco(conecta.rs.getString("endereco_cliente"));
        
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não Cadastro:\n");
        }
            conecta.desconecta();
            return mod;
    }
    
}
