/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelComida;


/**
 *
 * @author renato
 */
public class ControleComida {
    ConexaoDB conecta = new ConexaoDB();
    ModelComida mod = new ModelComida();
   
    public void Salvar(ModelComida mod){
         conecta.conexao();
        try {
           
            PreparedStatement pst = conecta.conect.prepareStatement("insert into comidas(tipo_comida,quantidade_comida) values(?,?)");
            pst.setString(1, mod.getTipoComida());
            pst.setInt(2, mod.getQuantComida());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Comida inserida com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Comidas:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }
    
        public void Alterar(ModelComida mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update comidas set tipo_comida=?,quantidade_comida=? where cod_comida=?");
        pst.setString(1, mod.getTipoComida());
         pst.setInt(2, mod.getQuantComida());
          pst.setInt(3, mod.getCodComida());
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados da Comida Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados da Comida:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
        
          public void Excluir(ModelComida mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("delete from comidas where cod_comida=?");
            pst.setInt(1, mod.getCodComida());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Comidaa Excluidas com sucesso\n" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Comida:\n" + ex.getMessage());
        }
        
        
        
        conecta.desconecta();
    }  
    
       
    public ModelComida buscaComida(ModelComida mod){
        
        
            conecta.conexao();
            conecta.executaSql("select *from comidas where tipo_comida like'%" + mod.getPesquisaComida()+ "%'");
           
            try{
            
            conecta.rs.first();
            mod.setCodComida(conecta.rs.getInt("cod_comida"));
            mod.setTipoComida(conecta.rs.getString("tipo_comida"));
            mod.setQuantComida(conecta.rs.getInt("quantidade_comida"));
            
        
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Comida não Cadastrada:\n");
        }
            conecta.desconecta();
            return mod;
    }
}
