/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidordemonedas;

/**
 *
 * @author CINDY GONZALEZ
 */
public class Euros {
  
    private double Dato_Inicial;
    private double Dato_final;
    private int Resultado;
    
    
    public Euros() {
    }

    public double getDato_Inicial() {
        return Dato_Inicial;
    }

    public void setDato_Inicial(double Dato_Inicial) {
        this.Dato_Inicial = Dato_Inicial;
    }

    public double getDato_final() {
        return Dato_final;
    }

    public void setDato_final(double Dato_final) {
        this.Dato_final = Dato_final;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }
    
    public void conversion(int IndiceObjetivo){
        if(IndiceObjetivo == 0){
            Dato_final = Dato_Inicial * 28.98;
        }
        if(IndiceObjetivo == 1){
            Dato_final = Dato_Inicial * 1.18;
        }
        if(IndiceObjetivo == 2){
            Dato_final = Dato_Inicial * 1;
        }
        if(IndiceObjetivo == 3){
            Dato_final = Dato_Inicial * 26.22;
        }
    }
    
}
