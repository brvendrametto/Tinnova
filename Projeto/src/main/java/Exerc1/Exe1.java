package Exerc1;


public class Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalEleitores = 1000; 
        int validos = 800; 
        int brancos = 150; 
        int nulos = 50; 
        
        System.out.println(votosValidos(totalEleitores, validos));
        System.out.println(votosBrancos(totalEleitores, brancos));
        System.out.println(votosNulos(totalEleitores, nulos));
        
    }
    private static int votosValidos(int totalEleitores, int validos){
        return (validos*100)/totalEleitores;
    };
    private static int votosBrancos(int totalEleitores, int brancos){
        return (brancos*100)/totalEleitores;
    };
    private static int votosNulos(int totalEleitores, int nulos){
        return (nulos*100)/totalEleitores;
    };
}
