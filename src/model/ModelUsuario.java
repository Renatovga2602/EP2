/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controler.ControleUsuario;


public class ModelUsuario {
    
    private Integer usoCod;
    private String usuNome;
    private String usoTipo;
    private String usoSenha;
    private String usuPesquisar;

    public String getUsuPesquisar() {
        return usuPesquisar;
    }

    public void setUsuPesquisar(String usuPesquisar) {
        this.usuPesquisar = usuPesquisar;
    }

    public Integer getUsoCod() {
        return usoCod;
    }

    public void setUsoCod(Integer usoCod) {
        this.usoCod = usoCod;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsoTipo() {
        return usoTipo;
    }

    public void setUsoTipo(String usoTipo) {
        this.usoTipo = usoTipo;
    }

    public String getUsoSenha() {
        return usoSenha;
    }

    public void setUsoSenha(String usoSenha) {
        this.usoSenha = usoSenha;
    }

    public void Salvar(ControleUsuario mod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
