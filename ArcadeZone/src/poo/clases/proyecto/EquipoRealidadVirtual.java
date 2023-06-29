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
public class EquipoRealidadVirtual extends Maquina{
    private String tipoDeEquipoRV;
    private double valorJuegoRV;
    private String tipoDeSimulacion;
    
    public void setTipoDeEquipoRV(String tipoDeEquipoRV) {
        this.tipoDeEquipoRV = tipoDeEquipoRV;
        if("Nintendo Labo VR".equals(this.tipoDeEquipoRV)){
            this.valorPorHora =4;
        }
        if("Valve Index".equals(this.tipoDeEquipoRV)){
            this.valorPorHora =4.80;
        }
        if("Oculus Rift".equals(this.tipoDeEquipoRV)){
            this.valorPorHora =5.60;
        }     
        if("HTC Vive".equals(this.tipoDeEquipoRV)){
            this.valorPorHora =5.75;
        }   
        if("Oculus Go".equals(this.tipoDeEquipoRV)){
            this.valorPorHora =4.25;
        }             
    }   

    public void setTipoDeSimulacion(String tipoDeSimulacion) {
        this.tipoDeSimulacion = tipoDeSimulacion;
        if("Conduccion".equals(this.tipoDeSimulacion)){
            this.valorJuegoRV = 3.50;
        }
        if("Shooter".equals(this.tipoDeSimulacion)){
            this.valorJuegoRV =1.50;
        }
        if("Visualización de entornos".equals(this.tipoDeSimulacion)){
            this.valorJuegoRV =0.50;
        }     
        if("Patinaje".equals(this.tipoDeSimulacion)){
            this.valorJuegoRV =2.25;
        }          
    }
    @Override
    public int getHorasDealquiler() {
        return horasDealquiler;
    }

    @Override
    public double getValorPorHora() {
        return valorPorHora;
    }

    @Override
    public double getCobrado() {
        return cobrado;
    }
    
    
    public void setHorasDealquiler(int horasDealquiler) {
        this.horasDealquiler = horasDealquiler;
    }
    
    
    @Override
    public Double calcularPago() {
        this.cobrado = this.valorJuegoRV+(this.horasDealquiler*this.valorPorHora);
        return this.cobrado;
    }

    @Override
    public String toString() {
        return this.tipoDeEquipoRV;
    }
    
}
