package aula02;

public class EstruturaDeRepeticao {
    public static void main(String[] args){
        System.out.println("Estrutura de Repetição FOR");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println("Exemplo de Repetição WHILE");
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        System.out.println("Exemplo de Repetição DO WHILE");
        int k = 60;
        do {
            System.out.println("O valor de K ainda é: " + k);
        }while (k <= 5);
    }

}
