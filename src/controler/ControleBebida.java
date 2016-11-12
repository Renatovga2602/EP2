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
            JOptionPane.showMessageDialog(null, "Bebidas inseridas com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Bebidas:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }
       public void Alterar(ModelBebida mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update bebidas set quantidade_bebida=? where cod_bebida=?");
       pst.setString(1, mod.getTipoBebida());
         pst.setInt(2, mod.getQuantBebida());
          
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados da bebida Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados do Produto:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
       
}
