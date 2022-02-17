package Test;

import java.util.Scanner;

public class Aula_01 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		if (idade > 17) 
		{
			System.out.println("você é maior de idade");
		}
		else if(idade == 18)
		{
			System.out.println("Depende do dia de seu aniversário");
		}
		else 
		{
			System.out.println("Você é menor de idade");
		}
		scanner.close();
	}

}
