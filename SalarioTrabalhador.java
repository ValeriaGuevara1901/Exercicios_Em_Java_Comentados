package Test;//package � onde se encontra o seu programa porque ele seria como a pasa principal onde voc� guarda o c�digo

import java.util.Scanner;//� nada mais que a biblioteca ou extens�o (eu acho) que permite ter uma forma de entrada de dados imagica que seja o teclado de seu noteboo 
//voc� interage com o usu�rio por aqui

public class SalarioTrabalhador 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);//declarando a entrada do "teclado"
		
		double salariotransformado;
		
		System.out.println("Por favor insira o valor de seu sal�rio");
		double Salario = input.nextDouble();
		
		System.out.println("Por favor insira o valor da taxa de empr�stimo ");
		double taxa = input.nextDouble();
		
		salariotransformado = Salario * 0.2;
		
		if( salariotransformado <  taxa)
		{
			System.out.println("Empr�stimo n�o concedido ");
		}
		else 
		{
			System.out.println("Empr�stimo concedido");
		}
	}

}