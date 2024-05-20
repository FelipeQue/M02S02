import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // M02S02 Exercício 04: Telas do console
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("""
                    O que deseja fazer?
                    1 - Cadastrar paciente.
                    2 - Listar pacientes.
                    3 - Alterar informações de paciente.
                    4 - Mostrar informações de paciente.
                    5 - Registrar atividade física para paciente.
                    6 - Remover paciente.
                    7 - Encerrar programa.""");
            System.out.print("> ");
            opcao = Integer.parseInt(scanner.next());

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("Cadastrar paciente.");
                    telaCadastrarPaciente(scanner);
                    continue;
                case 2:
                    System.out.println();
                    System.out.println("Lista de pacientes.");
                    telaListarPacientes();
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

    // M02S02 Exercício 05: Cadastro de paciente
    private static void telaCadastrarPaciente(Scanner scanner){
        Paciente paciente = new Paciente();
        System.out.println("Insira os dados de paciente:");

        System.out.print("Nome: ");
        paciente.nome = scanner.next();

        System.out.print("Idade: ");
        paciente.idade = Integer.parseInt(scanner.next());

        System.out.print("Peso: ");
        paciente.peso = Double.parseDouble(scanner.next());

        System.out.print("Altura: ");
        paciente.altura = Double.parseDouble(scanner.next());

        System.out.print("Pressão sistólica: ");
        paciente.peso = Integer.parseInt(scanner.next());

        System.out.print("Pressão diastólica: ");
        paciente.peso = Integer.parseInt(scanner.next());

        System.out.print("Frequência cardíaca: ");
        paciente.frequenciaCardiaca = Integer.parseInt(scanner.next());

        System.out.print("Tipo de dieta alimentar: ");
        paciente.dietaAlimentar = scanner.next();

        ListaPacientes.adicionarPaciente(paciente);
    }

    // M02S02 Exercício 06: Listar pacientes
    private static void telaListarPacientes() {
        ListaPacientes.listarPacientes();
    }


}
