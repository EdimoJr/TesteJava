package aula03.exercicios03;

public class TesteAnimal {
    public static void main(String[] args){
        Animal urso = new Animal("Ursinho", 5, "polar");
        System.out.println(urso.getNome() + " " + urso.getIdade() + " " + urso.getTipo());
        urso.setNome("Ted");
        System.out.println(urso.getNome() + " " + urso.getIdade() + " " + urso.getTipo());

        Cachorro thor = new Cachorro("Thor", 8, "viralata");
        System.out.println(thor.getNome() + " " + thor.getIdade() + " " + thor.getTipo());
        thor.fazer_som();

        Gato estrela = new Gato("Estrela", 10, "viralata");
        System.out.println(estrela.getNome() + " " + estrela.getIdade() + " " + estrela.getTipo());
        estrela.fazer_som();
    }
}
