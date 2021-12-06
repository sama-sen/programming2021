public class Practice_6
{
	
	public static void main (String[] args)
	{
		int Numero = IBIO.inputInt("What number do you want? ");
		int n = Numero;
		int contatore = 0;
		if (Numero > 0)
		{
			while (n > 0)
			{
				n = n / 10;
				contatore++;
				IBIO.output(">>>" + n + "   " + contatore);
			}
			IBIO.output("Your number has " + contatore + "characteristic places.");
			System.exit(0);
		}
		if (Numero < 0)
		{
			n = n * -1;
			while (n > 0)
			{
				n = n / 10;
				contatore++;
			}
			IBIO.output("Your number has " + contatore + "decimal places.");
			System.exit(0);
		}
	}
}

