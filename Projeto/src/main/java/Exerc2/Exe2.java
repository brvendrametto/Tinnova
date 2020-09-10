package Exerc2;

public class Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {5, 3, 2, 4, 7, 1, 0, 6};
        
        ordenar(v);
        
        for(int i=0; i < v.length; i++){  
                System.out.print(v[i] + ", ");  
        }  
        
    }

    private static void ordenar(int[] v) {
        int n = v.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(v[j-1] > v[j]){  
                                 temp = v[j-1];  
                                 v[j-1] = v[j];  
                                 v[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }
}
