/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author renato
 */
public class ConexaoDB {
    
   public Statement stm;//realiza pesquisa no db
   public ResultSet rs;//armazena resultado da pesquisa
   private String driver = "org.postgresql.Driver";//identifica o serviço no db
   private String caminho = "jdbc:postgresql://localhost:5432/CadastrodeCliente";//onde esta alocado o db
   private String usuario = "postgres";
   private String senha = "Wneto2602";
   public Connection conect;//conexao com db
    
   public void conexao(){//conecta a DB
      try{
       System.setProperty("jdbc.Drivers", driver);//setar a propriedade de conexão;
        conect = DriverManager.getConnection(caminho, usuario, senha);
         // JOptionPane.showMessageDialog(null,"Conexão Efetuada com Sucesso");
      }catch (SQLException ex){
          //Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE,null,ex);
          JOptionPane.showMessageDialog(null,"Error ao se conectar ao banco de dados:\n" + ex.getMessage());
      }
    }
   
   public void executaSql(String sql){
       
       try {//percorre do inicio ao fim no banco
           stm = conect.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
           
           rs = stm.executeQuery(sql);
           
          
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error Executa Sql:\n" + ex.getMessage());
      }
                    
   }
   
  
   public void desconecta(){//desconecta a DB
       try {
  
       conect.close();
       //JOptionPane.showMessageDialog(null,"Banco de Dados desconectado com sucesso");
       
       } catch (SQLException ex) {
          // Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null,"Error ao fechar Banco de Dados:\n" + ex.getMessage());
       }
   }

   
}

