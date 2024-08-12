package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{		
		Controller c = new Controller();
		int n = 5;
		int fat = c.Fat(n);
		System.out.println("O fatorial é: " + fat);
			
	}	
}