import java.util.Scanner;

public class SomaNumeros {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();
        int soma = numero1+numero2;
        System.out.println("A soma resultado da soma desses números é:" + soma+".");
    }
}
