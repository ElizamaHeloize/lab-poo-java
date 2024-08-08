
package prova1;
import java.util.Scanner;

//Escreva um programa que receba como entrada dois números inteiros e retorne a soma dos números
// positivos no intervalo definido por eles, considerando inclusive os extremos.

public class Questao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        if (n1 > n2){
            System.out.println("O começo do intervalo entre os números deve ser menor ou igual ao fim do intervalo.");
            return;
        }
        int soma = 0;
        for (int i = n1; i <= n2; i++){
            if ( n2 > 0 ){
                soma++;  }
            }
            System.out.println("A soma dos números é: " + soma);
}
}