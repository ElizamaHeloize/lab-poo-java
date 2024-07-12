package lab03;

public class Condicionais1 {
    public static void main(String[] args) {
        double lado = Double.parseDouble(args [0]);
        double volume = lado * lado;
        if (lado <= 0){
            System.out.println("Não é possível calcular o volume. ");
         }
        else {
            System.out.println("O volume do quadrado é: " + volume);
        }
       
        


    }
}