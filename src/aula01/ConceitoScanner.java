package aula01;

import java.util.Scanner;

public class ConceitoScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + ", sua idade é " + idade);

        scanner.close();
    }
}
