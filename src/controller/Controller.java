package controller;

public class Controller 
{	
	public Controller() 
	{
		super();
	}
	
	public int Fat (int n)
	{
		// CONDIÇÃO DE PARADA.
		if (n == 0) 
		{ 
			return 1;
		}
		
		else 
		{	
			return n * Fat(n-1); //chamada de passo
		}
	}
}