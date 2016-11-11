/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author renato
 */
public class ModelTable extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String [] colunas = null;


public ModelTable(ArrayList lin, String[] col){
  //metodo construtor
  setLinhas(lin);
  setColunas(col);
  
}

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

   public int getColumnCount() {
       return colunas.length;//conta numero de colunas esse metodo
   }
    
    public int getRowCount(){
        return linhas.size();//conta quantas linhas tem no Array
    }
    public String getColumnName(int numCol){
        return colunas[numCol];//pegar valor da coluna;
    }
    public Object getValueAt(int numLin, int numCol){
       //monta tabela esse metodo 
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
} 
