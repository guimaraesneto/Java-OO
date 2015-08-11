/*
* Curso Java Orientado a Objeto
* Autor: Edmilson Carneiro Guimarães
* Data: 11/08/2015
* Descrição: Essa classe tem como função mostrar 
* operaçoes aritmeticas simples.
*/
public class OperadorAritmetico{
	public static void main(String args[]){
		int soma = 10+5;
		int subtracao = 10-5;
		int multiplicacao = 10*5;
		int divisao = 10/5;
		int modulo = 5 % 2;
		
		System.out.println("+--------------------+");
		System.out.println("|       Dados        |");
		System.out.println("+--------------------+");
		System.out.println("10 + 5 = "+soma);
		System.out.println("10 - 5 = "+subtracao);
		System.out.println("10 * 5 = "+multiplicacao);
		System.out.println("10 / 5 = "+divisao);
		System.out.println("5 % 2 = "+modulo);
		System.out.println("+--------------------+");
	}
}