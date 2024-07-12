package lab03;

import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
            double lado = sc.nextDouble();
            double volume = lado * lado;
        if (lado <= 0){
            System.out.println("Não é possível calcular o volume. ");
         }
        else {
            System.out.println("O volume do quadrado é: " + volume);
        }
       
        


    }
}