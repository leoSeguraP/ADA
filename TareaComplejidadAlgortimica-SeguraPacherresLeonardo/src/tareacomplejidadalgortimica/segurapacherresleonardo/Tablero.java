package tareacomplejidadalgortimica.segurapacherresleonardo;

public class Tablero {
    private char[][] matriz; 
    
    public Tablero(char[][] matriz){
        this.matriz = matriz; 
    }
    
    public int getFilas(){
        return matriz.length;
    }
    
    public int getColumnas(){
        return matriz[0].length; 
    }
    
    public char getLetra(int fila, int columna){
        return matriz[fila][columna]; 
    }
    
    
}
