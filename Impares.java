package Test;

import java.util.Scanner;

public class Impares
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		int numero = input.nextInt();
		
			for(int i = 1;i<=numero;i++)
			{
				if (i%2 == 1)
					{
					System.out.println("N�mero impar : "+i);
					}
			}
		input.close();
	}
}