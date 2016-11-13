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
public class ModelPedidos {
    private double comida[];
    private double bebida[];
    private double sobremesa[];

    public double[] getComida() {
        return comida;
    }

    public void setComida(double[] comida) {
        this.comida = comida;
    }

    public double[] getBebida() {
        return bebida;
    }

    public void setBebida(double[] bebida) {
        this.bebida = bebida;
    }

    public double[] getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(double[] sobremesa) {
        this.sobremesa = sobremesa;
    }
  
}
