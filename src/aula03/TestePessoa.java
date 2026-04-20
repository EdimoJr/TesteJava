package aula03;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa fulano2 = new Pessoa("Edimo", 29, 1.75);
        Aluno aluno1 = new Aluno("Aluninho", 29, 1.75, "A001");
        Calculadora calc = new Calculadora();
        System.out.println(fulano2.getNome());

        Professor prof1 = new Professor("Zezinho", 34, 1.80, 4000, "algoritmos");

        System.out.println(prof1.getNome());
        System.out.println(prof1.getSalario());

        prof1.aumentaSalaario();
        System.out.println(prof1.getSalario());

        System.out.println(aluno1.getNome());

        aluno1.setNome("João Paulo");

        System.out.println(aluno1.getNome());

        // Exemplo que a função "aumentaSalaario();" pertence somente ao professor
        // aluno1.aumentaSalaario();

        System.out.println(calc.soma(5, 5));
        System.out.println(calc.subtracao(5, 2));

    }
}
