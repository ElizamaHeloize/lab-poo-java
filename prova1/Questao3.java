package prova1;
import java.util.Scanner;

//Escreva um algoritmo que leia certa quantidade de numeros 
//e imprima o maior deles e quantas vezes o maior numero foi lido.
//A quantidade de números a serem lidos deve ser  fornecida pelo usuario.
public class Questao3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de números a serem lidos: ");
         int quantidade = sc.nextInt();
         int maior = 0;
         int lidos =1; 
         for (int i = 0; i < quantidade; i++){
            System.out.println("Informe o número: " );
            int numero = sc.nextInt();
            if(numero > maior){
                maior = numero;
                lidos = 1; 
            }else if (numero == maior){
                lidos++;
            }
         }
         System.out.println("Maior numero: " + maior);
         System.out.println("Quantidade de vezes que o maior número foi lido: " + lidos);
                                     

    }
    
    
    
    }
