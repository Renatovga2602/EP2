/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class ModelProduto {
    
    
    private String tipo;
     private Integer quantidade;
     private String pesquisaprod;
   //  private final int Identificador=0;

  //  public int getIdentificador() {
   //     return Identificador;
   // }

    public String getPesquisaprod() {
        return pesquisaprod;
    }

    public void setPesquisaprod(String pesquisaprod) {
        this.pesquisaprod = pesquisaprod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
