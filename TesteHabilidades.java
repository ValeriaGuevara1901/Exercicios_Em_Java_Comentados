package Test;

import java.util.Scanner;// extensão para o leitor

public class TesteHabilidades {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int n1,n2,soma;
		System.out.printf("Insira o primeira valor");
		n1 = input.nextInt();
		System.out.printf("Insira o primeira valor");
		n2 = input.nextInt();
		soma = n1 + n2;
		System.out.printf("%d",soma);
	}

}
