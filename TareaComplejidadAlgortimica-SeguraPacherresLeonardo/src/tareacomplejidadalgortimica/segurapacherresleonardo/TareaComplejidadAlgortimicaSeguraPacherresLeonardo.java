package tareacomplejidadalgortimica.segurapacherresleonardo;

public class TareaComplejidadAlgortimicaSeguraPacherresLeonardo {
   public static void main(String[] args) {
        char[][] matriz = {
            {'E', 'S', 'T', 'O'},
            {'S', 'T', 'T', 'M'},
            {'E', 'A', 'S', 'A'},
            {'P', 'R', 'N', 'E'}
        };
        
        String[] listaPalabras = {"esto", "ese", "pato", "este"}; 
        
        Tablero tablero = new Tablero(matriz); 
        Buscador buscador = new Buscador(); 
        
        for(String texto: listaPalabras){
            Palabra palabra = new Palabra(texto.toUpperCase()); 
            buscador.buscarPalabra(tablero, palabra);
            System.out.println(palabra);    
        }
    }
    
}
