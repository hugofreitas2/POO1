import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a quantidade de assentos que serão vendidos (1 a 9): ");
            n = sc.nextInt();
        } while (n < 1 || n > 9);

        List<Ticket> lista = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < n; i++) {
            System.out.println("\nCadastro do ingresso " + (i + 1) + ":");

            System.out.print("Digite seu CPF: ");
            int cpf = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Digite seu primeiro nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
            LocalDate dataNasc = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Digite o gênero: ");
            String genero = sc.nextLine();

            int assento;
            while (true) {
                System.out.print("Digite qual assento você deseja comprar (0 a 9): ");
                assento = sc.nextInt();
                sc.nextLine(); 

                boolean assentoOcupado = false;
                for (Ticket p : lista) {
                    if (p.getAssentos() == assento) {
                        assentoOcupado = true;
                        break;
                    }
                }

                if (assento < 0 || assento > 9) {
                    System.out.println("Erro: Número de assento inválido. Escolha entre 0 e 9.");
                } else if (assentoOcupado) {
                    System.out.println("Erro: Esse assento já está ocupado. Escolha outro.");
                } else {
                    break; 
                }
            }


            Ticket ingresso = new Ticket(cpf, nome, sobrenome, dataNasc, genero, assento);
            lista.add(ingresso);
        }

        
        System.out.println("\nIngressos cadastrados:");
        for (Ticket ingresso : lista) {
            System.out.println(ingresso);
        }

        sc.close();
    }
}