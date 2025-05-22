package tarea02.segurapacherresleonardo;
import java.util.Scanner;

public class Tarea02SeguraPacherresLeonardo {
    public static int recursividad(int m, int n){
        int A = 0;
        if(m == 0){
            A = n+1; 
        }else if(m>0 && n == 0){ 
            A = recursividad(m-1, n); 
        }else if(m>0 && n>0){
            A = recursividad(m-1, recursividad(m,n-1)); 
        }
        return A; 
    }
    public static void main(String[] args) {
        int m,n,a;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de m: ");
        m = leer.nextInt(); 
        
        System.out.println("\nIngrese el valor de n: ");
        n = leer.nextInt(); 
               
        System.out.println("El valor de A es: " + recursividad(n,m));
    }
    
}
