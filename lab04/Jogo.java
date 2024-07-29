package lab04;
import java.util.Scanner;
public class Jogo {
    // java lab04/Jogo.java
    public static void main(String[] args) {
        /*/ CRIAR JOGO QUE GERE UM NÚMERO ALEATORIO */

        var sc = new Scanner(System.in);
            System.out.println("Informe seu número da sorte: ");
            double numero = sc.nextInt();
            int aleatorio =(int) (Math.random()*100); 
            do {
                   System.out.println("Esse é o número da sorte! ");
                if (numero == aleatorio ){
                }
                else if( aleatorio < numero  ){
                    System.out.println("Esse número é menor que o número da sorte ! ");
                }
                else if ( aleatorio > numero ){
                    System.out.println("Esse número é maior que o número da sorte! ");
                }

            }
            while (true);
        }


}   
