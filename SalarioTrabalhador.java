package Test;//package é onde se encontra o seu programa porque ele seria como a pasa principal onde você guarda o código

import java.util.Scanner;//É nada mais que a biblioteca ou extensão (eu acho) que permite ter uma forma de entrada de dados imagica que seja o teclado de seu noteboo 
//você interage com o usuário por aqui

public class SalarioTrabalhador 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);//declarando a entrada do "teclado"
		
		double salariotransformado;
		
		System.out.println("Por favor insira o valor de seu salário");
		double Salario = input.nextDouble();
		
		System.out.println("Por favor insira o valor da taxa de empréstimo ");
		double taxa = input.nextDouble();
		
		salariotransformado = Salario * 0.2;
		
		if( salariotransformado <  taxa)
		{
			System.out.println("Empréstimo não concedido ");
		}
		else 
		{
			System.out.println("Empréstimo concedido");
		}
	}

}