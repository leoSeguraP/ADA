package tareacomplejidadalgortimica.segurapacherresleonardo;

public class Palabra {
    private String texto; 
    private int filaInicio, colInicio, filaFin, colFin; 
    private boolean encontrada; 
    
    public Palabra(String texto){
        this.texto = texto; 
        this.encontrada = false; 
    }
    
    public String getTexto(){
        return texto; 
    }
    
    public void setPosicion(int filaInicio, int colInicio,int filaFin, int colFin ){
        this.filaInicio = filaInicio; 
        this.colInicio = colInicio; 
        this.filaFin = filaFin; 
        this.colFin = colFin; 
        this.encontrada = true; 
    }
    
    @Override 
    public String toString(){
        if(encontrada){
            return  texto + ": (" + (filaInicio+1) + "," + (colInicio+1) + ") a (" + (filaFin+1) + "," + (colFin+1) + ")";
        }else{
            return texto + ": no encontrada"; 
        }
        
    }
}
