package aula03;

public class Professor extends Pessoa{
    private double salario;
    private String diciplina;

    public Professor(String nome, int idade, double altura, double salario, String diciplina){
        super(nome, idade, altura);
        this.salario = salario;
        this.diciplina = diciplina;
    }

    public void aumentaSalaario(){
        //return this.salario * 1.1;
        setSalario(salario * 1.1);
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
