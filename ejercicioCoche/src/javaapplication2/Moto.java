package javaapplication2;


public class Moto extends Vehiculo {
    
    private int casco;
    private boolean sidecar;
    
    
    public Moto(int potencia, int rueda, boolean estado, String marca, int casco, boolean sidecar){
        super(potencia, rueda, estado, marca);
        this.casco = casco;
        this.sidecar = sidecar;
    }
    
    
}
