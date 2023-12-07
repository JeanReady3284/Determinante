
public class Operaciones {
    
    static void obtenerCofactor(int matriz[][], int temp[][],int p, int q, int n){
        
        int i=0; 
        int j=0;
        for(int fila=0; fila<n; fila++){
           for(int columna=0; columna<n; columna++){
            if(fila!= p && columna!=q)
            {
                temp[i][j++]= matriz[fila][columna];
                
                if(j==n-1)
                {
                 j=0;
                 i++;
                }
            }
        } 
    }
        
}// termina cofactor
    
    static int determinanteMatriz(int matriz[][], int n){
        int Determinante=0;
        
        if(n==1){
            return matriz[0][0];
        }
        int temp[][]= new int[n][n];
        int multiplicador=1;
        for(int f=0; f<n; f++){
            obtenerCofactor(matriz,temp,0,f,n);
            Determinante+= multiplicador* matriz[0][f]*determinanteMatriz(temp, n-1);
            multiplicador=-multiplicador;
        }
        return Determinante;
    }
    
}

