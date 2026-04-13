
package javaapplication2;

public class Coche extends Vehiculo {
    
    private int puertas;
    private boolean siMarchas;
    private String marca;
    
    
    public Coche(int potencia, int rueda, boolean estado, String marca, int puertas, boolean siMarchas){
        super(potencia, rueda, estado, marca); //llamamos al constructor padre
        this.puertas = puertas;
        this.siMarchas = siMarchas;
    }
}
