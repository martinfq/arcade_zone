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
public class ConsolaDeVideojuego extends Maquina {
    private int numMandos;
    private double valorPorMando;
    private String tipoDeConsola;
    
    public void setTipoDeConsola(String tipoDeConsola) {
        this.tipoDeConsola = tipoDeConsola;
        if("Xbox One".equals(this.tipoDeConsola)){
            this.valorPorHora =2;
        }
        if("Xbox Series X".equals(this.tipoDeConsola)){
            this.valorPorHora =2.50;
        }
        if("Wii".equals(this.tipoDeConsola)){
            this.valorPorHora =1.25;
        }     
        if("Playstation 4".equals(this.tipoDeConsola)){
            this.valorPorHora =2.25;
        }   
        if("Playstation 5".equals(this.tipoDeConsola)){
            this.valorPorHora =2.75;
        }             
    }    

    public void setNumMandos(int numMandos) {
        this.numMandos = numMandos;
        if(this.numMandos ==1){
            this.valorPorMando=0.25;
        }
        if(this.numMandos ==2){
            this.valorPorMando=0.50;
        }   
        if(this.numMandos ==3){
            this.valorPorMando=0.75;
        }
        if(this.numMandos ==4){
            this.valorPorMando=1;
        }        
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
        return this.tipoDeConsola;
    }
    
    
    @Override
    public Double calcularPago() {
        this.cobrado = (this.valorPorMando)+(valorPorHora*horasDealquiler);
        return this.cobrado;
    }
    
}
