package br.com.senai.teste;

public class Tarefa2 {
	public static void main(String[] args) {
		double altura = (int)2;
		double bmenor = (int)4;
		double bmaior = (int)8;
		double area = (bmenor + bmaior)*altura/2;
		System.out.println("A Ar�a arredondada desse trap�zio �: "+area);
		double alturab = 2.4;
		double bmenorb = 4.3;
		double bmaiorb = 8.5;
		double areab = (bmenorb + bmaiorb)*alturab/2;
		System.out.println("Mas a Ar�a exata desse trap�zio �: "+areab);
	}
}
