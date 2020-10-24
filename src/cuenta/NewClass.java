/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Master Estampado SG
 */
public class NewClass {
    
    private String titular;
    private int cantidad;
    
    //constructor 1
    public NewClass(){
        this.cantidad = 0;
        this.titular = "";
        
    }
    //constructor 2
    public NewClass(String titular, int cantidad){
        this.titular = titular;
        if (cantidad < 0){
        this. cantidad = 0;
    }else{
            this. cantidad = cantidad;
        }
    }
    //metodo
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void ingresarCantidad(int cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    public void retirarCantidad(int cantidad){
        if(this.cantidad-cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad-= cantidad;
        }
    }
    @Override
    public String toString(){
        return ("El titular " + titular + " posee $" + cantidad + " pesos en la cuenta ");
    }

    void ingresarCantidad(int i, int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void retirarCantidad(int i, int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
