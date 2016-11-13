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
public class ModelSobremesa {
       private Integer CodSobremesa;
    private String TipoSobremesa;
    private Integer QuantSobremesa;
     private String PesquisaSobremesa;

    public String getPesquisaSobremesa() {
        return PesquisaSobremesa;
    }

    public void setPesquisaSobremesa(String PesquisaSobremesa) {
        this.PesquisaSobremesa = PesquisaSobremesa;
    }

    public Integer getCodSobremesa() {
        return CodSobremesa;
    }

    public void setCodSobremesa(Integer CodSobremesa) {
        this.CodSobremesa = CodSobremesa;
    }

    public String getTipoSobremesa() {
        return TipoSobremesa;
    }

    public void setTipoSobremesa(String TipoSobremesa) {
        this.TipoSobremesa = TipoSobremesa;
    }

    public Integer getQuantSobremesa() {
        return QuantSobremesa;
    }

    public void setQuantSobremesa(Integer QuantSobremesa) {
        this.QuantSobremesa = QuantSobremesa;
    }

   
}
