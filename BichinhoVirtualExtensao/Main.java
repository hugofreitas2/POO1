import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        Bichinho pet = null;

        do {
            System.out.println("Digite o nome do seu bichinho:");
            String nome = sc.nextLine();

            System.out.println("Escolha se vai ser 1 - Gato ou 2 - Cachorro (1 ou 2):");
            int d = sc.nextInt();
            sc.nextLine(); 

            switch (d) {
                case 1:
                    pet = new Gato(nome);
                    System.out.println("Você criou um gato chamado " + nome);
                    i++;
                    break;
                case 2:
                    pet = new Cachorro(nome);
                    System.out.println("Você criou um cachorro chamado " + nome);
                    i++;
                    break;
                default:
                    System.out.println("Digite um número válido (1 ou 2).");
                    break;
            }

        } while (i != 1);

        do {


            System.out.println("Menu:\n");
            System.out.println("1. Alimentar o Bichinho\n");
            System.out.println("2. Brincar com o Bichinho\n");
            System.out.println("3. Dormir\n");
            System.out.println("4. Emitir Som");
            System.out.println("Escolha um:\n");
            int p = sc.nextInt();

            if(p < 1 || p > 4){
                System.out.println("\nNumero Invalido. Digite outro numero: \n");
            }

            if(p == 1){
                pet.alimentar();
            }

            if(p == 2){
                pet.brincar();
            }

            if(p == 3){
                pet.dormir();
            }

            if(p == 4){
                pet.emitirSom();
            }

            if(pet.getEnergia() == 0){
                System.out.println("Sua Energia Acabou, Game Over.\n");
                break;
            }

            if(pet.getEnergia() == 1){
                System.out.println("Cuidado, valor de Energia proximo de 0.\n");
            }

            if(pet.getSono() == 5){
                System.out.println("Seu Personagem dormiu demais, Game Over.\n");
                break;
            }


        } while (pet.getEnergia() > 0 || pet.getSono() < 5);

    }


    }
        
    


    
