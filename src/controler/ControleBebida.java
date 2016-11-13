/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelBebida;
import model.ModelCliente;



public class ControleBebida {
    ConexaoDB conecta = new ConexaoDB();
    ModelBebida mod = new ModelBebida();
   
    public void Salvar(ModelBebida mod){
         conecta.conexao();
        try {
           
            PreparedStatement pst = conecta.conect.prepareStatement("insert into bebidas(tipo_bebida,quantidade_bebida) values(?,?)");
            pst.setString(1, mod.getTipoBebida());
            pst.setInt(2, mod.getQuantBebida());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Bebida inserida com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Bebidas:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }
    
        public void Alterar(ModelBebida mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update bebidas set tipo_bebida=?,quantidade_bebida=? where cod_bebida=?");
        pst.setString(1, mod.getTipoBebida());
         pst.setInt(2, mod.getQuantBebida());
          pst.setInt(3, mod.getCodBebida());
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados da Bebida Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados da Bebida:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
        
          public void Excluir(ModelBebida mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("delete from bebidas where cod_bebida=?");
            pst.setInt(1, mod.getCodBebida());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Bebida Excluidos com sucesso\n" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Bebida:\n" + ex.getMessage());
        }
        
        
        
        conecta.desconecta();
    }  
    
       
    public ModelBebida buscaBebida(ModelBebida mod){
        
        
            conecta.conexao();
            conecta.executaSql("select *from bebidas where tipo_bebida like'%" + mod.getPesquisaBebida()+ "%'");
           
            try{
            
            conecta.rs.first();
            mod.setCodBebida(conecta.rs.getInt("cod_bebida"));
            mod.setTipoBebida(conecta.rs.getString("tipo_bebida"));
            mod.setQuantBebida(conecta.rs.getInt("quantidade_bebida"));
            
        
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Bebida não Cadastrada:\n");
        }
            conecta.desconecta();
            return mod;
    }
       
}
