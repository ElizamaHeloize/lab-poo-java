
package lab03;
import java.util.Scanner;

//o programa irá ler um conceito 
//transformar em número
// A - 100
// B - 90
// C - 80
// D - 70 
// E - 60

public class Conceito{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um conceito: ");
    var conceito = sc.next();
    switch (conceito) {
        case "A"  -> System.out.println("SUA NOTA É 100");
        case "B" -> System.out.println("SUA NOTA 90");
        case "C" -> System.out.println("SUA NOTA É 80");
        case "D" -> System.out.println("SUA NOTA É 70");
        case "E" -> System.out.println("SUA NOTA É 60");

    }
    sc.close();
    }
}
