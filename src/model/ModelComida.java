/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author renato
 */
public class ModelComida {
    private Integer CodComida;
    private String TipoComida;
     private Integer QuantComida;
    private String PesquisaComida;

    public Integer getCodComida() {
        return CodComida;
    }

    public void setCodComida(Integer CodComida) {
        this.CodComida = CodComida;
    }

    public String getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(String TipoComida) {
        this.TipoComida = TipoComida;
    }

    public Integer getQuantComida() {
        return QuantComida;
    }

    public void setQuantComida(Integer QuantComida) {
        this.QuantComida = QuantComida;
    }

    public String getPesquisaComida() {
        return PesquisaComida;
    }

    public void setPesquisaComida(String PesquisaComida) {
        this.PesquisaComida = PesquisaComida;
    }
   
}
