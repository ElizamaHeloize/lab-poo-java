package prova1;
import java.util.Scanner;

//Faça um programa que calcula a quantidade de 
//divisores de um número (incluindo 1 e o próprio número)
public class Questao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                 divisores++;}
    }
    System.out.println( " O número de divisores é: " + divisores);
    
    }
}

