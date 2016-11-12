/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class ModelBebida {
   
    private Integer CodBebida;
    private String TipoBebida;
    private Integer QuantBebida;

   

    public Integer getCodBebida() {
        return CodBebida;
    }

    public void setCodBebida(Integer CodBebida) {
        this.CodBebida = CodBebida;
    }

    public String getTipoBebida() {
        return TipoBebida;
    }

    public void setTipoBebida(String TipoBebida) {
        this.TipoBebida = TipoBebida;
    }

    public Integer getQuantBebida() {
        return quantBebida;
    }

    public void setQuantBebida(Integer quantBebida) {
        this.quantBebida = quantBebida;
    }
    private Integer quantBebida;
}
