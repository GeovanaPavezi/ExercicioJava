import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Entre com o nome do Aluno: ");
        aluno.setNome(ler.next());
        System.out.println("Entre com o RA do Aluno: ");
        aluno.setRegistroAcademico(ler.nextInt());
        System.out.println("Entre com a nota da primeira prova (0 a 10): ");
        aluno.setNotaProva1(ler.nextDouble());
        System.out.println("Entre com a nota da segunda prova (0 a 10): ");
        aluno.setNotaProva2(ler.nextDouble());
        System.out.println("Entre com a nota do trabalho (0 a 10): ");
        aluno.setNotaTrabalho(ler.nextDouble());

        aluno.calculoMedia();
        aluno.status();
    }
}