package javaapplication2;

public class Vehiculo {
    
    int potencia;
    int rueda;
    boolean estado;
    String marca;
    
    
   public Vehiculo(int potencia, int rueda, boolean estado, String marca){
       this.potencia = potencia;
       this.rueda = rueda;
       this.estado = estado;
       this.marca = marca;  
    }
    
   public String getMarca(){
       return marca;
   }
            
}
