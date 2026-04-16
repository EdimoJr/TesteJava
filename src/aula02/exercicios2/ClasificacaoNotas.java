package aula02.exercicios2;

import java.util.Scanner;

public class ClasificacaoNotas {
    /*
    Classificação de Notas

    Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
    9-10: Excelente
    7-8.9: Bom
    5-6.9: Satisfatório
    0-4.9: Insuficiente
    Entrada: Uma nota em decimal Saída: Classificação da nota
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float nota;

        System.out.println("Qual foi sua nota?");
        nota = sc.nextFloat();

        System.out.println("Sua nota é Classificada como: ");

        if (nota < 5){
            System.out.println("Insuficiente");
        } else if (nota < 7 ) {
            System.out.println("Satisfatório");
        }else if (nota < 9 ) {
            System.out.println("Bom");
        }else if (nota <= 10 ) {
            System.out.println("Excelente");
        }else{
            System.out.println("Nota inválida");
        }//Nota menor que zero é porque o aluno deveu nota haha!

        sc.close();
    }
}
