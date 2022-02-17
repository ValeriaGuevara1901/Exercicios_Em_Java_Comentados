package Test;

import java.util.Scanner;//extensão para usar o scanner"teclado"

public class Multiplos
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);//criando a entrada para a leitura
		
		int fixo = 3;
		
		System.out.println("Os primeiro 5 multiplos de 3 são: ");
		for(int i = 1; i<= 5;i++) 
		{
			int multiplo = i*fixo;

			System.out.println(multiplo);
		}
		input.close();
	}
}