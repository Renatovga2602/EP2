/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelSobremesa;


/**
 *
 * @author renato
 */
public class ControleSobremesa {
     ConexaoDB conecta = new ConexaoDB();
    ModelSobremesa mod = new ModelSobremesa();
   
    public void Salvar(ModelSobremesa mod){
         conecta.conexao();
        try {
           
            PreparedStatement pst = conecta.conect.prepareStatement("insert into sobremesas(tipo_sobremesa,quantidade_sobremesa) values(?,?)");
            pst.setString(1, mod.getTipoSobremesa());
            pst.setInt(2, mod.getQuantSobremesa());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sobremesas inserida com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Sobremesas:\n" + ex.getMessage());
        }
       conecta.desconecta(); 
    }
    
        public void Alterar(ModelSobremesa mod){
        
    conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("update sobremesas set tipo_sobremesa=?,quantidade_sobremesa=? where cod_sobremesa=?");
        pst.setString(1, mod.getTipoSobremesa());
         pst.setInt(2, mod.getQuantSobremesa());
          pst.setInt(3, mod.getCodSobremesa());
             pst.execute();
             
              JOptionPane.showMessageDialog(null, "Dados da Sobremesa Alterados com Sucesso");
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Alterar Dados da Sobremesa:\n" + ex.getMessage());
        }
    
     conecta.desconecta();
    }
        
          public void Excluir(ModelSobremesa mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conect.prepareStatement("delete from sobremesas where cod_sobremesa=?");
            pst.setInt(1, mod.getCodSobremesa());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Sobremesa Excluidas com sucesso\n" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Sobremesa:\n" + ex.getMessage());
        }
        
        
        
        conecta.desconecta();
    }  
    
       
    public ModelSobremesa buscaSobremesa(ModelSobremesa mod){
        
        
            conecta.conexao();
            conecta.executaSql("select *from sobremesas where tipo_sobremesa like'%" + mod.getPesquisaSobremesa()+ "%'");
           
            try{
            
            conecta.rs.first();
            mod.setCodSobremesa(conecta.rs.getInt("cod_sobremesa"));
            mod.setTipoSobremesa(conecta.rs.getString("tipo_sobremesa"));
            mod.setQuantSobremesa(conecta.rs.getInt("quantidade_sobremesa"));
            
        
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sobremesa não Cadastrada:\n");
        }
            conecta.desconecta();
            return mod;
    }
       
}
