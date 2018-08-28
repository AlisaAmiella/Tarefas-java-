package br.com.senai.teste;

public class TesteFor {
	public static void main(String[] args) {
		int numero = 10;
		int fatorial = 1;
		for (int i = numero; i > 0; i --)
		{
		fatorial = fatorial * i;
		}
		System.out.println("fatorial de "+numero+" ="+fatorial);

		for (int mes = 1; mes < 12; mes++ )
		{
		switch (mes)
		{
		case 1:
		System.out.println("janeiro"); break;
		case 2:
		System.out.println("março"); break;
		case 3:
			System.out.println("abril"); 
			break;
		}

	}
	}
}
