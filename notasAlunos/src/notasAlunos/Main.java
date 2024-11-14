package notasAlunos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		System.out.println("Digite o nome do aluno: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite a nota 2: ");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite a nota 3: ");
		Scanner sc4 = new Scanner(System.in);
		
		NotasAlunos aluno = new NotasAlunos(sc.next(), sc2.nextDouble(), sc3.nextDouble(), sc4.nextDouble());
		
		
		
		aluno.calcNotaFinal();
		
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
	}

}
