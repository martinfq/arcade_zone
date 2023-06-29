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
public class Computadora extends Maquina{
    private String tipoDeComputadora;

    public void setTipoDeComputadora(String tipoDeComputadora) {
        this.tipoDeComputadora = tipoDeComputadora;
        if("Computadora Gamer".equals(this.tipoDeComputadora)){
            this.setValorPorHora(1.50);
        }
        if("Computadora Oficina".equals(this.tipoDeComputadora)){
            this.setValorPorHora(0.75);
        }
    }
    
    public String getTipoDeComputadora() {
        return tipoDeComputadora;
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

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double getCobrado() {
        return cobrado;
    }

    @Override
    public String toString() {
        return this.tipoDeComputadora;
    }
    
    
    @Override
    public Double calcularPago() {
        this.cobrado=valorPorHora*horasDealquiler;
        return this.cobrado;
    }
    
}
