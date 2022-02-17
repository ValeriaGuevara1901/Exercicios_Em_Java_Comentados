package Test;
import java.util.Scanner;

public class RecebaDoisNumeros 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Por favor insira os valores que deseja que sejam comparados");
		
		System.out.println("Insira o primeiro valor a ser comparado");
		double n1 = input.nextDouble();
		
		System.out.println("Insira o segundo valor a ser comparado");
		double n2 = input.nextDouble();
		
		if (n1 > n2)
		{
			System.out.println("O valor maior entre o primeiro e o segundo numero é : "+n1);
		}
		else 
		{
			System.out.println("O valor maior entre o primeiro e o segundo numero é : "+n2);
		}
	}
}