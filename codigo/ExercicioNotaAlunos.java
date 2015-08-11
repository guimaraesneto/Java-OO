/*
* Curso Java Orientado a Objeto
* Autor: Edmilson Carneiro Guimarães
* Data: 11/08/2015
* Descrição: Exercicio de uso de operações aritmeticas.
*/
public class ExercicioNotaAlunos {
	public static void main(String args[]){
		String nomeAluno = "Predin";
		double nota1 = 8.0;
		double nota2 = 7.0;
		double nota3 = 5.0;
		double media = 0.0;
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("+-----------------------------------------------+");
		System.out.println("                      Boletin        ");
		System.out.println("+-----------------------------------------------+");
		System.out.println("");
		System.out.println("Primeira nota do aluno "+nomeAluno+" eh: "+nota1);
		System.out.println("Segunda nota do aluno "+nomeAluno+" eh: "+nota2);
		System.out.println("Terceira nota do aluno "+nomeAluno+" eh: "+nota3);
		System.out.println("");
		System.out.println("+-----------------------------------------------+");
		System.out.println("O aluno "+nomeAluno+" teve media "+media+".");
		System.out.println("");
		System.out.println("+-----------------------------------------------+");
	}
}