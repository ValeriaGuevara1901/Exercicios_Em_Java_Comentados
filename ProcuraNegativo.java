package Test;

import java.util.Scanner;

public class ProcuraNegativo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		double maior = 0;
		double menor = 999;

		
	  do {		
		  System.out.println("Por favor insira os  valores que deseje");
		  valor = input.nextInt();
			  if(valor >=0)
			  {
				  if(valor > maior) 
					{
							maior = valor;	  
					}
					if(menor > valor)
					{
							menor = valor;
					}
			  }
	  	 } while (valor >=0);
	  System.out.println("O maior número é: "+maior);
	  System.out.println("O menor número é: "+menor);	  
	  input.close();
	}
}	