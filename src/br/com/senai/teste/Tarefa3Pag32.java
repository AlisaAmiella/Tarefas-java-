package br.com.senai.teste;

import java.util.Scanner;
public class Tarefa3Pag32 {
	public static void main(String[] args) {
		long x = 0, par=0, impar=0;
		int n;
		@SuppressWarnings("resource")
		Scanner Megumin = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("Digite o n�mero: \n");
		n = Megumin.nextInt(); 
		System.out.println("N�mero digitado: "+n);
		System.out.println("----------------------------------------------------------------------");
		if(n%2==0){
			System.out.println("O n�mero � par.");
		}
			if(n%2==1) {
				System.out.println("O n�mero � impar.");
		}
			if(n%1==0) {
	         System.out.println("O n�mero � primo.");
	         }
}
}

