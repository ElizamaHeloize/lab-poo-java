package lab04;
import java.util.Scanner;

public class Tabuada {
    // java lab04/Repeticoes4.java
    public static void main(String[] args) {
        /**
         * for: Fornece uma estrutura mais compacta para iterar sobre uma série de valores. É
         * útil quando o número de iterações é conhecido antecipadamente.
         */
        var sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(numero + "X" + i + "=");
            System.out.println(i);
            


            
        }
    }
}
