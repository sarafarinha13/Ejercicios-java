package marioparty;

public class Jugador {
    
    private String nombre;
    private int monedas;
    private int estrellas;
    private int posicion;
    
    
    public Jugador(String n, int nMonedas, int nEstrellas, int nPosicion){
        this.nombre = n;
        this.monedas = nMonedas;
        this.estrellas = nEstrellas;
        this.posicion = nPosicion;
    }
    
    
    //métodos del jugador
    //METODOS NOMBRE
    public String getNombre(){
        return nombre;
    }
    
    
    //METODOS MONEDAS
    public void alterMonedas(int cantidadMonedas){
        monedas += cantidadMonedas;
        
        if(monedas < 0){
            monedas = 0;
        }
    }
   
    public int getMonedas(){
        return monedas;
    }
    
    //METODOS ESTRELLAS
    public void alterEstrellas(int estrellas){
        this.estrellas += estrellas;
        
        if(this.estrellas < 0){
            this.estrellas = 0;
        }
    }
    
    public int getEstrellas(){
        return this.estrellas;
    }
    
    
    
    
}
