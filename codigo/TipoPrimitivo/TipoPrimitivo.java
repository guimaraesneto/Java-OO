/*
* Curso Java Orientado a Objeto
* Autor: Edmilson Carneiro Guimarães
* Data: 11/08/2015
* Descrição: Trabalha com os alunos o uso de tipos de variabeis.
*/
public class TipoPrimitivo{
	public static void main(String[] args) {
		double precoProduto = 9.44;

		boolean alunoMatriculado = true;
		boolean clienteBloqueado = false;
		boolean valorMaior = 4>3;

		char turmaAluno = 'A';
		char tipoCliente = '2';
		char simbolo = '@';

		int numeroInteiro = 127;
		long populacaoMundo = 7000000000L;

		System.out.println("+-----------------------------------------------+");
		System.out.println("                      Resultados        ");
		System.out.println("+-----------------------------------------------+");
		System.out.println("");
		System.out.println("Uso de Double: "+precoProduto);
		System.out.println("");
		System.out.println("Uso de booleano: ");
		System.out.println("Aluno Matriculado: "+alunoMatriculado);
		System.out.println("Cliente Bloqueado: "+clienteBloqueado);
		System.out.println("4 > 3 ? "+valorMaior);
		System.out.println("");
		System.out.println("Uso do Char");
		System.out.println("Turma do Aluno: "+turmaAluno);
		System.out.println("Tipo de Cliente: "+tipoCliente);
		System.out.println("Simbolo: "+simbolo);
		System.out.println("");
		System.out.println("Uso do Double:");
		System.out.println("Numero Inteiro: "+numeroInteiro);
		System.out.println("Populacao Mundial: "+populacaoMundo);
		System.out.println("");
		System.out.println("+-----------------------------------------------+");
		
	}
}