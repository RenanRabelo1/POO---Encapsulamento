import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println("Qual seu CPF?");
        String CPF = sc.next();
        System.out.println("Qual seu ano de nascimento?");
        int anoNasc = sc.nextInt();
        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();
        System.out.println("Qual o ano atual?");

        Pessoa pessoa = new Pessoa(nome, CPF, anoNasc, altura);

        pessoa.anoAtual = sc.nextInt();

        pessoa.Mostra();

    }
}
