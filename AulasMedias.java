public class AulasMedias 
{

	public static void main(String[] args)
	{
		//organização das variaveis e preenchimento do nosso vetor 
		int[] nums = new int [3];
		nums[0] = 7;
		nums[1] = 10;
		nums[2] = 9;
		
		int mediatotal = 0; //variavel que armazenará o valor total do valor dos vetores
		//Aqui será realizada a operação de armazanamento dos valores 
		for (int i = 0; i < nums.length; i++)
		{
			mediatotal += nums[i];
		}
		float total = (float)mediatotal/nums.length;
		System.out.println("A media total dos vetores é de: "+total);
	}
}