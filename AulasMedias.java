public class AulasMedias 
{

	public static void main(String[] args)
	{
		//organiza��o das variaveis e preenchimento do nosso vetor 
		int[] nums = new int [3];
		nums[0] = 7;
		nums[1] = 10;
		nums[2] = 9;
		
		int mediatotal = 0; //variavel que armazenar� o valor total do valor dos vetores
		//Aqui ser� realizada a opera��o de armazanamento dos valores 
		for (int i = 0; i < nums.length; i++)
		{
			mediatotal += nums[i];
		}
		float total = (float)mediatotal/nums.length;
		System.out.println("A media total dos vetores � de: "+total);
	}
}