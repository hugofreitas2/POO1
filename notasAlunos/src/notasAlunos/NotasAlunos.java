package notasAlunos;

public class NotasAlunos {
		
		private String nome;
		private double nota1;
		private double nota2;
		private double nota3;
		private double notafinal;
		
		public NotasAlunos(String nome, double nota1, double nota2, double nota3) {
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
			checaNotaValida();
		}
		
		public void checaNotaValida() {
			if(nota1 < 0 || nota1 > 10) {
				throw new IllegalArgumentException("nota invalida");
			}else if(nota2 < 0 || nota2 > 10) {
				throw new IllegalArgumentException("nota invalida");
			}else if(nota3 < 0 || nota3 > 10) {
				throw new IllegalArgumentException("nota invalida");
			}
		}
		
		public void calcNotaFinal() {
			notafinal = (nota1 * 0.3) + (nota2 * 0.35) + (nota3 * 0.35);
			if(notafinal >= 6) {
				System.out.println("Aluno " + nome + " Aprovado com " + notafinal + " de média");
			}else{
				System.out.println("Aluno " + nome + " Reprovado com " + notafinal + " de média");
			}
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}

		public double getNotafinal() {
			return notafinal;
		}

		public void setNotafinal(double notafinal) {
			this.notafinal = notafinal;
		}
		
		
}
