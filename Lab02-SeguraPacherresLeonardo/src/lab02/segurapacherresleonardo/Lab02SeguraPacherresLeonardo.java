package lab02.segurapacherresleonardo;
import java.util.Scanner; 

public class Lab02SeguraPacherresLeonardo {

    public static void main(String[] args) {
        int size, suma, max;
        int array[]; 
        
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del array: ");
        size = leer.nextInt(); 
                
        array = new int[size]; 
        for(int i = 0; i<size; i++){
            System.out.println("Ingrese un numero: ");
            array[i] = leer.nextInt(); 
        }
        
        sumaMaxima(array,size);
               
        
    }
    
    public static void sumaMaxima(int a[], int b){
        int suma = 0; 
        int max = 0; 
        for(int i = 0; i<b; i++){
            suma = suma + a[i]; 
            if(suma<0){
                suma = 0; 
            }
            if(suma>=max){
                max = suma; 
            }
        }
        
        System.out.println("La suma maxima es: "+ max);
    }
    
}
