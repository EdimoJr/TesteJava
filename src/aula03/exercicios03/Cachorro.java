package aula03.exercicios03;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String tipo){
        super(nome, idade, tipo);
    }
    public void fazer_som(){
        System.out.println("Au AU");
    }
}
