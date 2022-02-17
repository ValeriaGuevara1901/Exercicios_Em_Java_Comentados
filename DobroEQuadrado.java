package Test;

import java.util.Scanner;

public class DobroEQuadrado 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double quadrado, dobro;
		
		System.out.println("Por favor insira o valor que deseje para realizar a operação");
		double n1 = input.nextDouble();
		
		if (n1 > 0)
		{
			dobro = 2*n1;
			System.out.println("O valor do dobro do número inserido é : "+dobro);
		}
		else 
		{
			quadrado = n1*n1;
			System.out.println("O valor do quadrado do número inserio é : "+quadrado);
		}
	}

}