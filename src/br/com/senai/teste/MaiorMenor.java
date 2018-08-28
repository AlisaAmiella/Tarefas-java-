package br.com.senai.teste;

public class MaiorMenor {
	public static void main(String[] args) {
		int maior = 10; 
		int menor = 5;
		System.out.println("------------------------------");
		System.out.println("Letra A");
		if (maior > menor) 
		{
		System.out.println(maior+">"+menor);
		}
		else {
			System.out.println(menor+">"+maior);
		}
		boolean verdade = (10>5);
		if (verdade) {
			System.out.println(maior+">"+menor);
		}
		else {
			System.out.println(menor+">"+maior);
		}
		System.out.println("------------------------------");
	}

}
