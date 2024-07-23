package lab04;
import java.util.Scanner;
public class Jogo {
    // java lab04/Jogo.java
    public static void main(String[] args) {
        /*/ CRIAR JOGO QUE GERE UM NÚMERO ALEATORIO  */
        var sc = new Scanner(System.in);
            System.out.println("Informe seu número da sorte: ");
        var numero = 0;
            numero = sc.nextInt();
            while (numero < 2){
                if (numero == 2){
                     System.out.println("Esse é o número da sorte! ");
                }
                
                else if( numero != 10 ){
                    System.out.println("Esse não é o número da sorte! ");
                }
            }
        }


}   
