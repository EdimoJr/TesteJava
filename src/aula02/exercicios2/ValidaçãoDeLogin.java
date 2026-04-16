package aula02.exercicios2;

import java.util.Scanner;

public class ValidaçãoDeLogin {
    /*
    Validação de Login

    Crie um programa que simule um login. O programa deve:
    Ler um nome de usuário e uma senha
    Verificar se o usuário é "admin" E a senha é "1234"
    Se ambos estiverem corretos, exiba "Login realizado!"
    Caso contrário, exiba "Usuário ou senha incorretos"
    Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userValido = "admin", senhaValida = "1234", user, senha;

        System.out.print("Informe o login: ");
        user = scanner.nextLine();

        System.out.print("Informe a senha: ");
        senha = scanner.nextLine();

        if((user.equals(userValido) ) && (senha.equals(senhaValida))){
            System.out.println("Login realizado!");
        }else {
            System.out.println("Usuário ou senha incorretos");
        }

        scanner.close();
    }
}
