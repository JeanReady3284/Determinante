
import java.util.Scanner;


public class Determinante {


    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        int n;

        System.out.println("Escriba el tamaño de la matriz: \t");
        n=entrada.nextInt();
        int matriz[][]=new int[n][n];
        
        System.out.println("Ingrese los valores de la matriz:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               System.out.println("Posición:["+i+"]"+"["+j+"]"); 
               matriz[i][j]=entrada.nextInt();
            }
            
        }
        System.out.println("El determinante de la matriz es: "+Operaciones.determinanteMatriz(matriz,n));
        
    }
    
    
}
