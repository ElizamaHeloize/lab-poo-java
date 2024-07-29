package prova1;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Escolha uma das opções a seguir (1- adição, 2- subtração, 3- multiplicação, 4- divisão): ");
         int op = sc.nextInt();
        System.out.println("Informe o primeiro número: ");
            double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
            double n2 = sc.nextDouble();
             var soma = n1 + n2;
             var subtração = n1 - n2;
             var multiplicação = n1 * n2;
             var divisão = n1 / n2;
        if ( op == 1 ){
            System.out.println("A soma dos números que você informou é:" + soma);
        } else if ( op == 2 ){
             System.out.println("A subtração dos números que você informou é:" + subtração);
        } else if  ( op == 3 ){
            System.out.println("A multiplicação dos números que você informou é:" + multiplicação);
       }  else if( op == 4){
        System.out.println("A divisão dos números que você informou é:" + divisão);
   }
       
    }
    
    
    
    }