package aula01;

public class Variaveis {
    public static void main(String[] args){
        System.out.println("Hello Edy!");
        // Variavel do tipo inteiro
        int idade = 29;
        System.out.println("Sua ideade é: " + idade );
        // Variavel do tipo flutuante (casas decimais)
        float altura = 1.75f;
        // Variavel do tipo String
        String nome = "Edimo";
        // Variavel do tipo boolean (verdadeiro ou falso)
        boolean estagiario = false;
        // Variavel do tipo Array (vetor)
        int[] notas = {5, 7, 9, 8};
        String[] nomes = {"Edimo", "Darlan", "Olesio"};
        System.out.println("O primeiro nome é " + nomes[0] + ", e a primeira variavel nota é " + notas[0]);
    }
}
