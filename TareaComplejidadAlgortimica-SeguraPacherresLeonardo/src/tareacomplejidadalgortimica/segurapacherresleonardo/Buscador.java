package tareacomplejidadalgortimica.segurapacherresleonardo;

public class Buscador {
    private static final int[][] DIRECCIONES = {
        {0, 1}, {0, -1}, {1, 0}, {-1, 0},
        {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
    };
    
    public void buscarPalabra(Tablero tablero, Palabra palabra){
        int filas = tablero.getFilas(); 
        int cols = tablero.getColumnas(); 
        String texto = palabra.getTexto(); 
        
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<cols;  j++){
                for(int[] dir: DIRECCIONES){
                    if(buscarDesde(tablero, texto, i, j, dir[0], dir[1])){
                        int filaFin = i + dir[0] * (texto.length()-1); 
                        int colFin = j + dir[0] * (texto.length()-1); 
                        palabra.setPosicion(i, j, filaFin, colFin);
                        return; 
                    }
                }
            }
        }
    }
    
    private boolean buscarDesde(Tablero tablero, String palabra, int fila, int col, int df, int dc){
        for(int k = 0; k<palabra.length(); k++){
            int nuevaFila = fila + df * k; 
            int nuevaCol = col + dc * k; 
            
            if(nuevaFila<0 || nuevaCol<0 || nuevaFila>=tablero.getFilas() || nuevaCol >= tablero.getColumnas()){
                return false; 
            }
        }
        return true; 
    }
}
