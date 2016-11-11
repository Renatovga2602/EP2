/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelCliente;
import model.ModelUsuario;


public class ControleUsuario {
    
       ConexaoDB conecta = new ConexaoDB();
    ModelUsuario mod = new ModelUsuario();
   
    public void Salvar(ModelUsuario mod){
         conecta.conexao();
        try {
           
            PreparedStatement pst = conecta.conect.prepareStatement("insert into usuarios(nome_usuario,senha_usuario,tipo_usuario) values(?,?,?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsoSenha());
            pst.setString(3, mod.getUsoTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário inserido Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }

     public ModelUsuario buscaUsuario(ModelUsuario mod){
        
        
            conecta.conexao();
            conecta.executaSql("select *from usuarios where nome_usuario like'%" + mod.getUsuPesquisar()+ "%'");
           
            try{
            
            conecta.rs.first();
            mod.setUsoCod(conecta.rs.getInt("cod_usuario"));
            mod.setUsuNome(conecta.rs.getString("nome_usuario"));
            mod.setUsoSenha(conecta.rs.getString("senha_usuario"));
            mod.setUsoTipo(conecta.rs.getString("tipo_usuario"));
           
        
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não Cadastro:\n" + ex);
        }
            conecta.desconecta();
            return mod;
    }
     public void Alterar(ModelUsuario mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update usuarios set nome_usuario=?,senha_usuario=?,tipo_usuario=? where cod_usuario=?");
        pst.setString(1, mod.getUsuNome());
         pst.setString(2, mod.getUsoSenha());
          pst.setString(3, mod.getUsoTipo());
           pst.setInt(4, mod.getUsoCod());
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados do usuário Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados do Usuário:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
 
      public void Excluir(ModelUsuario mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("delete from usuarios where cod_usuario=?");
            pst.setInt(1, mod.getUsoCod());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário Excluido com sucesso\n" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuário:\n" + ex.getMessage());
        }
        
        
        
        conecta.desconecta();
    } 
}
