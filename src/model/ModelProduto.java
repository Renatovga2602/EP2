/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controler.ControleProduto;

public class ModelProduto {
    
    
    private String tipo;
     private String quantidade;
     private String pesquisaprod;

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

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
