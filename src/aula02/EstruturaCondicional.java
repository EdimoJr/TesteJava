package aula02;

public class EstruturaCondicional {
    public static void main(String[] args){

        int diaDaSemana = 3;
        // condicionador switch / escolha
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingão");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            default:
                System.out.println("Opção inválida");
        }

        int idade = 20;

        if(idade < 12){
            System.out.println("Você é uma criança");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente");
        } else {
            System.out.println("Você é um adulto");
        }

        boolean carteira = true;

        if (carteira){
            System.out.println("Você é habilitado");
        }else {
            System.out.println("Você não é habilitado");
        }
        //operador AND
        if (idade >= 18 && carteira){
            System.out.println("Você pode dirigir.");
        }else {
            System.out.println("Você não pode dirigir!");
        }
        //Operador OR
        boolean temCarro = false;
        boolean temMoto = false;
        if ((idade >= 18 && carteira) && (temCarro || temMoto)){
            System.out.println("Você pode rodar.");
        }else {
            System.out.println("Você não pode rodar!");
        }
    }
}
