package br.com.senai.teste;

public class TesteContinue {
	public static void main(String[] args) {
		// pulando a execução No 10 e parando na No 15 
		for (int i=1; i<20; i++) 
		{   
			if(i == 10)   
			{    
				continue;   
				}   
			else if(i == 15)   
			{    
				break;   
				}   
			System.out.println("contador: " + i); }
		
		// usando label para controlar o desvio da execução
		// de um programa Java
		desvio: for (int i=0; i<20; i++)
		{
		if(i == 10)
		{
		continue desvio;
		}
		else if(i == 15)
		{
		// Essa linha nunca será executada
		// pois o laço sempre será reiniciado
			// quando o valor de i for igual a 10 break desvio;
		}
		System.out.println("contador: " + i);
		}

	}

}
