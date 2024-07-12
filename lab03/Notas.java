package lab03;
import java.util.Scanner;


//Escreva um programa para converter nota  conceito:
//O programa irá ler um número
//e transformar em conceito
//Nota | Conceito


public class Notas{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua nota: ");
    double notas = sc.nextDouble();
    if (notas >= 90){
        System.out.println("Conceito A");
    } else if (notas >= 80){
        System.out.println("Conceito B");
    } else if (notas >= 70){
        System.out.println("Conceito C"); 
    } else if (notas >= 60){
        System.out.println("Conceito D");
    } else if (notas >= 50){
        System.out.println("Conceito E");
    } else if (notas < 50){
        System.out.println("Conceito F");
    }


    }
    }
