import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // M02S02 Exercício 04: Telas do console
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println();
        while (true) {
            System.out.println("""
                    O que deseja fazer?
                    1 - Cadastrar um novo paciente.
                    2 - Listar todos os pacientes.
                    3 - Alterar informações do paciente.
                    4 - Mostrar informações de um paciente.
                    5 - Registrar atividade física para um paciente.
                    6 - Remover paciente.
                    7 - Encerrar programa.""");
            System.out.print("> ");
            opcao = Integer.parseInt(scanner.next());

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1.");
                    continue;
                case 2:
                    System.out.println("Você escolheu a opção 2.");
                    continue;
                case 3:
                    System.out.println("Você escolheu a opção 3.");
                    continue;
                case 4:
                    System.out.println("Você escolheu a opção 4.");
                    continue;
                case 5:
                    System.out.println("Você escolheu a opção 5.");
                    continue;
                case 6:
                    System.out.println("Você escolheu a opção 6.");
                    continue;
                case 7:
                    System.out.println("Você escolheu SAIR.");
                    break;
                default:
                    continue;
            }
            break; // Este é o break referente ao while que engloba tudo;
        }
        scanner.close();




    }
}
