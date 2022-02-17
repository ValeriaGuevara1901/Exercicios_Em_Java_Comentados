package Test;
import java.util.Scanner;// leitor de entrada teclado

public class Testeifelse
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner (System.in); // criando o "teclado" para entrar as variaveis
		
		int soma,substracao,multiplica;//declarando as variaveis com antecedencia
		
		System.out.println("Insira o primeira valor");
		int n1 = input.nextInt();//aqui se cria a variavel na hora, pode ser mais facil, aqui criamos a variavel e ao mesmo tempo ela armazena o dado  1 de entrada
		
		System.out.println("Insira o primeira valor");
		int n2 = input.nextInt();//dado 2 de entrada é o esmo teclado porém armazenado em diferentes variaveis
		
		// estrutura de lógica se e senão 
		if (n1> n2) 
		{
			substracao = n1 -n2;
			System.out.printf(" "+substracao);
		}
		else if (n1< n2)
		{
			multiplica = n1 *n2;
			System.out.printf("%d",multiplica);
		}
		else 
		{
			soma = n1 +n2;
			System.out.printf("%d",soma);	
		}
	}

}
