package Exerc4;

import java.util.Scanner;

public class Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Insira o número");
    int num = myObj.nextInt();
    
    int soma = 0, aux;
    
    for(aux = 0; aux<=num; aux++){
        if (aux%3==0 || aux%5==0){
            soma = soma + aux;            
        }
    }
    
    
    System.out.print(soma);
    }
    
}
