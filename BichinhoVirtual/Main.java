import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        

            System.out.println("Digite o nome do seu bichinho: ");
            String nome = sc.nextLine();

            Bichinho b = new Bichinho(nome);

        do { 


            System.out.println("Menu:\n");
            System.out.println("1. Alimentar o Bichinho\n");
            System.out.println("2. Brincar com o Bichinho\n");
            System.out.println("3. Dormir\n");
            System.out.println("Escolha um:\n");
            int p = sc.nextInt();

            if(p < 1 || p > 3){
                System.out.println("\nNumero Invalido. Digite outro numero: \n");
            }

            if(p == 1){
                b.alimentar();
            }

            if(p == 2){
                b.brincar();
            }

            if(p == 3){
                b.dormir();
            }

            if(b.getEnergia() == 0){
                System.out.println("Sua Energia Acabou, Game Over.\n");
                break;
            }

            if(b.getEnergia() == 1){
                System.out.println("Cuidado, valor de Energia proximo de 0.\n");
            }

            if(b.getSono() == 5){
                System.out.println("Seu Personagem dormiu demais, Game Over.\n");
                break;
            }


        } while (b.getEnergia() > 0 || b.getSono() < 5);

    }


    
}