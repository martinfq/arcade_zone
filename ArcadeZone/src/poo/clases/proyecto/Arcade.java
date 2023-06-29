/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clases.proyecto;

/**
 *
 * @author Milton
 */
public class Arcade extends Maquina{
    private String tipoDeArcade;
    private int numJugadores;

    public void setTipoDeArcade(String tipoDeArcade) {
        this.tipoDeArcade = tipoDeArcade;
        if("Arcade deportivo".equals(this.tipoDeArcade)){
            this.valorPorHora =1.00;
        }
        if("Arcade carreras".equals(this.tipoDeArcade)){
            this.valorPorHora =1.00;
        }
        if("Arcade simulación".equals(this.tipoDeArcade)){
            this.valorPorHora =1.50;
        }
        if("Arcade acción".equals(this.tipoDeArcade)){
            this.valorPorHora =1.50;
        }
        if("Arcade clasico".equals(this.tipoDeArcade)){
            this.valorPorHora =0.50;
        }
       
    }

    public String getTipoDeArcade() {
        return tipoDeArcade;
    }
   
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    @Override
    public int getHorasDealquiler() {
        return horasDealquiler;
    }

    public void setHorasDealquiler(int horasDealquiler) {
        this.horasDealquiler = horasDealquiler;
    }

    @Override
    public double getValorPorHora() {
        return valorPorHora;
    }

    @Override
    public double getCobrado() {
        return cobrado;
    }

    @Override
    public String toString() {
        return this.tipoDeArcade;
    }
    
    @Override
    public Double calcularPago() {
        this.cobrado=this.numJugadores*(this.horasDealquiler*this.valorPorHora);
       return this.cobrado;
    }
    
}
