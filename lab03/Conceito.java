
package lab03;
import java.util.Scanner;

//o programa irá ler um conceito 
//transformar em número
// A - 100
// B - 90
// C - 80
// D - 70 
// E - 60

public class Conceito {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um conceito: ");
    double conceito = sc.nextDouble();
    if (notas >= 90){
        System.out.println("Conceito A");
    } else if (conceito >= 80){
        System.out.println("Conceito B");
    } else if (conceito >= 70){
        System.out.println("Conceito C"); 
    } else if (conceito >= 60){
        System.out.println("Conceito D");
    } else if (conceito>= 50){
        System.out.println("Conceito E");
    } else if (conceito < 50){
        System.out.println("Conceito F");
    }


    }
    }
