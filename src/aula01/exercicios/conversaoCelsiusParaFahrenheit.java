package aula01.exercicios;

import java.util.Scanner;

public class conversaoCelsiusParaFahrenheit {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 35;

        System.out.println("A conversão de Celsius para Fahrenheit é " + fahrenheit);

        scanner.close();
    }
}
